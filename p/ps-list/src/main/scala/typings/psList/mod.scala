package typings.psList

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("ps-list", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(): js.Promise[js.Array[ProcessDescriptor]] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[js.Promise[js.Array[ProcessDescriptor]]]
  inline def default(options: Options): js.Promise[js.Array[ProcessDescriptor]] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[ProcessDescriptor]]]
  
  trait Options extends StObject {
    
    /**
    	Include other users' processes as well as your own.
    	On Windows this has no effect and will always be the users' own processes.
    	@default true
    	*/
    val all: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setAll(value: Boolean): Self = StObject.set(x, "all", value.asInstanceOf[js.Any])
      
      inline def setAllUndefined: Self = StObject.set(x, "all", js.undefined)
    }
  }
  
  trait ProcessDescriptor extends StObject {
    
    /**
    	Not supported on Windows.
    	*/
    val cmd: js.UndefOr[String] = js.undefined
    
    /**
    	Not supported on Windows.
    	*/
    val cpu: js.UndefOr[Double] = js.undefined
    
    /**
    	Not supported on Windows.
    	*/
    val memory: js.UndefOr[Double] = js.undefined
    
    val name: String
    
    val pid: Double
    
    val ppid: Double
    
    /**
    	Not supported on Windows.
    	*/
    val uid: js.UndefOr[Double] = js.undefined
  }
  object ProcessDescriptor {
    
    inline def apply(name: String, pid: Double, ppid: Double): ProcessDescriptor = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], pid = pid.asInstanceOf[js.Any], ppid = ppid.asInstanceOf[js.Any])
      __obj.asInstanceOf[ProcessDescriptor]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ProcessDescriptor] (val x: Self) extends AnyVal {
      
      inline def setCmd(value: String): Self = StObject.set(x, "cmd", value.asInstanceOf[js.Any])
      
      inline def setCmdUndefined: Self = StObject.set(x, "cmd", js.undefined)
      
      inline def setCpu(value: Double): Self = StObject.set(x, "cpu", value.asInstanceOf[js.Any])
      
      inline def setCpuUndefined: Self = StObject.set(x, "cpu", js.undefined)
      
      inline def setMemory(value: Double): Self = StObject.set(x, "memory", value.asInstanceOf[js.Any])
      
      inline def setMemoryUndefined: Self = StObject.set(x, "memory", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setPid(value: Double): Self = StObject.set(x, "pid", value.asInstanceOf[js.Any])
      
      inline def setPpid(value: Double): Self = StObject.set(x, "ppid", value.asInstanceOf[js.Any])
      
      inline def setUid(value: Double): Self = StObject.set(x, "uid", value.asInstanceOf[js.Any])
      
      inline def setUidUndefined: Self = StObject.set(x, "uid", js.undefined)
    }
  }
}
