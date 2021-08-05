package typings.sindresorhusDf

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
  	 * Get free disk space info from [`df -kP`](https://en.wikipedia.org/wiki/Df_\(Unix\)).
  	 *
  	 * @returns A list of space info objects for each filesystem.
  	 */
  inline def apply(): js.Promise[js.Array[SpaceInfo]] = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[js.Promise[js.Array[SpaceInfo]]]
  
  @JSImport("@sindresorhus/df", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  // TODO: remove this in the next major version
  @JSImport("@sindresorhus/df", "default")
  @js.native
  def default: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof df */ js.Any = js.native
  inline def default_=(x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof df */ js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("default")(x.asInstanceOf[js.Any])
  
  /**
  	 * @param path - Path to a file on the filesystem to get the space info for.
  	 * @returns Space info for the filesystem the given file is part of.
  	 */
  inline def file(path: String): js.Promise[SpaceInfo] = ^.asInstanceOf[js.Dynamic].applyDynamic("file")(path.asInstanceOf[js.Any]).asInstanceOf[js.Promise[SpaceInfo]]
  
  /**
  	 * @param path - Path to a filesystem device file. Example: `'/dev/disk1'`.
  	 * @returns Space info for the given filesystem.
  	 */
  inline def fs(path: String): js.Promise[SpaceInfo] = ^.asInstanceOf[js.Dynamic].applyDynamic("fs")(path.asInstanceOf[js.Any]).asInstanceOf[js.Promise[SpaceInfo]]
  
  trait SpaceInfo extends StObject {
    
    /**
    		 * Available size in bytes.
    		 */
    val available: Double
    
    /**
    		 * Capacity as a float from `0` to `1`.
    		 */
    val capacity: Double
    
    /**
    		 * Name of the filesystem.
    		 */
    val filesystem: String
    
    /**
    		 * Disk mount location.
    		 */
    val mountpoint: String
    
    /**
    		 * Total size in bytes.
    		 */
    val size: Double
    
    /**
    		 * Used size in bytes.
    		 */
    val used: Double
  }
  object SpaceInfo {
    
    inline def apply(
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
    
    extension [Self <: SpaceInfo](x: Self) {
      
      inline def setAvailable(value: Double): Self = StObject.set(x, "available", value.asInstanceOf[js.Any])
      
      inline def setCapacity(value: Double): Self = StObject.set(x, "capacity", value.asInstanceOf[js.Any])
      
      inline def setFilesystem(value: String): Self = StObject.set(x, "filesystem", value.asInstanceOf[js.Any])
      
      inline def setMountpoint(value: String): Self = StObject.set(x, "mountpoint", value.asInstanceOf[js.Any])
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setUsed(value: Double): Self = StObject.set(x, "used", value.asInstanceOf[js.Any])
    }
  }
}
