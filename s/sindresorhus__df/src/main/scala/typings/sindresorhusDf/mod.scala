package typings.sindresorhusDf

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
  	 * Get free disk space info from [`df -kP`](https://en.wikipedia.org/wiki/Df_\(Unix\)).
  	 *
  	 * @returns A list of space info objects for each filesystem.
  	 */
  @JSImport("@sindresorhus/df", JSImport.Namespace)
  @js.native
  def apply(): js.Promise[js.Array[SpaceInfo]] = js.native
  
  @JSImport("@sindresorhus/df", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  // TODO: remove this in the next major version
  @JSImport("@sindresorhus/df", "default")
  @js.native
  def default: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof df */ js.Any = js.native
  @scala.inline
  def default_=(x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof df */ js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("default")(x.asInstanceOf[js.Any])
  
  /**
  	 * @param path - Path to a file on the filesystem to get the space info for.
  	 * @returns Space info for the filesystem the given file is part of.
  	 */
  @JSImport("@sindresorhus/df", "file")
  @js.native
  def file(path: String): js.Promise[SpaceInfo] = js.native
  
  /**
  	 * @param path - Path to a filesystem device file. Example: `'/dev/disk1'`.
  	 * @returns Space info for the given filesystem.
  	 */
  @JSImport("@sindresorhus/df", "fs")
  @js.native
  def fs(path: String): js.Promise[SpaceInfo] = js.native
  
  @js.native
  trait SpaceInfo extends StObject {
    
    /**
    		 * Available size in bytes.
    		 */
    val available: Double = js.native
    
    /**
    		 * Capacity as a float from `0` to `1`.
    		 */
    val capacity: Double = js.native
    
    /**
    		 * Name of the filesystem.
    		 */
    val filesystem: String = js.native
    
    /**
    		 * Disk mount location.
    		 */
    val mountpoint: String = js.native
    
    /**
    		 * Total size in bytes.
    		 */
    val size: Double = js.native
    
    /**
    		 * Used size in bytes.
    		 */
    val used: Double = js.native
  }
  object SpaceInfo {
    
    @scala.inline
    def apply(
      available: Double,
      capacity: Double,
      filesystem: String,
      mountpoint: String,
      size: Double,
      used: Double
    ): SpaceInfo = {
      val __obj = js.Dynamic.literal(available = available.asInstanceOf[js.Any], capacity = capacity.asInstanceOf[js.Any], filesystem = filesystem.asInstanceOf[js.Any], mountpoint = mountpoint.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], used = used.asInstanceOf[js.Any])
      __obj.asInstanceOf[SpaceInfo]
    }
    
    @scala.inline
    implicit class SpaceInfoMutableBuilder[Self <: SpaceInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAvailable(value: Double): Self = StObject.set(x, "available", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCapacity(value: Double): Self = StObject.set(x, "capacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilesystem(value: String): Self = StObject.set(x, "filesystem", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMountpoint(value: String): Self = StObject.set(x, "mountpoint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUsed(value: Double): Self = StObject.set(x, "used", value.asInstanceOf[js.Any])
    }
  }
}
