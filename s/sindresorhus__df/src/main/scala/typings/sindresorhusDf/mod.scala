package typings.sindresorhusDf

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@sindresorhus/df", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def diskSpace(): js.Promise[js.Array[SpaceInfo]] = ^.asInstanceOf[js.Dynamic].applyDynamic("diskSpace")().asInstanceOf[js.Promise[js.Array[SpaceInfo]]]
  
  inline def diskSpaceForFilesystem(pathToDeviceFile: String): js.Promise[SpaceInfo] = ^.asInstanceOf[js.Dynamic].applyDynamic("diskSpaceForFilesystem")(pathToDeviceFile.asInstanceOf[js.Any]).asInstanceOf[js.Promise[SpaceInfo]]
  
  inline def diskSpaceForFilesystemOwningPath(path: String): js.Promise[SpaceInfo] = ^.asInstanceOf[js.Dynamic].applyDynamic("diskSpaceForFilesystemOwningPath")(path.asInstanceOf[js.Any]).asInstanceOf[js.Promise[SpaceInfo]]
  
  trait SpaceInfo extends StObject {
    
    /**
    	Available size in bytes.
    	*/
    val available: Double
    
    /**
    	Capacity as a float from `0` to `1`.
    	*/
    val capacity: Double
    
    /**
    	Name of the filesystem.
    	*/
    val filesystem: String
    
    /**
    	Disk mount location.
    	*/
    val mountpoint: String
    
    /**
    	Total size in bytes.
    	*/
    val size: Double
    
    /**
    	Type of the filesystem.
    	_(Not available on macOS)_
    	*/
    val `type`: String
    
    /**
    	Used size in bytes.
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
      `type`: String,
      used: Double
    ): SpaceInfo = {
      val __obj = js.Dynamic.literal(available = available.asInstanceOf[js.Any], capacity = capacity.asInstanceOf[js.Any], filesystem = filesystem.asInstanceOf[js.Any], mountpoint = mountpoint.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], used = used.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[SpaceInfo]
    }
    
    extension [Self <: SpaceInfo](x: Self) {
      
      inline def setAvailable(value: Double): Self = StObject.set(x, "available", value.asInstanceOf[js.Any])
      
      inline def setCapacity(value: Double): Self = StObject.set(x, "capacity", value.asInstanceOf[js.Any])
      
      inline def setFilesystem(value: String): Self = StObject.set(x, "filesystem", value.asInstanceOf[js.Any])
      
      inline def setMountpoint(value: String): Self = StObject.set(x, "mountpoint", value.asInstanceOf[js.Any])
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setUsed(value: Double): Self = StObject.set(x, "used", value.asInstanceOf[js.Any])
    }
  }
}
