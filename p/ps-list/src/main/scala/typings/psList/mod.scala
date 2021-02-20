package typings.psList

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
  Get running processes.
  @returns List of running processes.
  @example
  ```
  import psList = require('ps-list');
  (async () => {
  	console.log(await psList());
  	//=> [{pid: 3213, name: 'node', cmd: 'node test.js', ppid: 1, uid: 501, cpu: 0.1, memory: 1.5}, …]
  })();
  ```
  */
  @JSImport("ps-list", JSImport.Namespace)
  @js.native
  def apply(): js.Promise[js.Array[ProcessDescriptor]] = js.native
  @JSImport("ps-list", JSImport.Namespace)
  @js.native
  def apply(options: Options): js.Promise[js.Array[ProcessDescriptor]] = js.native
  
  @js.native
  trait Options extends StObject {
    
    /**
    		Include other users' processes as well as your own.
    		On Windows this has no effect and will always be the users' own processes.
    		@default true
    		*/
    val all: js.UndefOr[Boolean] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAll(value: Boolean): Self = StObject.set(x, "all", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllUndefined: Self = StObject.set(x, "all", js.undefined)
    }
  }
  
  @js.native
  trait ProcessDescriptor extends StObject {
    
    /**
    		Not supported on Windows.
    		*/
    val cmd: js.UndefOr[String] = js.native
    
    /**
    		Not supported on Windows.
    		*/
    val cpu: js.UndefOr[Double] = js.native
    
    /**
    		Not supported on Windows.
    		*/
    val memory: js.UndefOr[Double] = js.native
    
    val name: String = js.native
    
    val pid: Double = js.native
    
    val ppid: Double = js.native
    
    /**
    		Not supported on Windows.
    		*/
    val uid: js.UndefOr[Double] = js.native
  }
  object ProcessDescriptor {
    
    @scala.inline
    def apply(name: String, pid: Double, ppid: Double): ProcessDescriptor = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], pid = pid.asInstanceOf[js.Any], ppid = ppid.asInstanceOf[js.Any])
      __obj.asInstanceOf[ProcessDescriptor]
    }
    
    @scala.inline
    implicit class ProcessDescriptorMutableBuilder[Self <: ProcessDescriptor] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCmd(value: String): Self = StObject.set(x, "cmd", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCmdUndefined: Self = StObject.set(x, "cmd", js.undefined)
      
      @scala.inline
      def setCpu(value: Double): Self = StObject.set(x, "cpu", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCpuUndefined: Self = StObject.set(x, "cpu", js.undefined)
      
      @scala.inline
      def setMemory(value: Double): Self = StObject.set(x, "memory", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMemoryUndefined: Self = StObject.set(x, "memory", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPid(value: Double): Self = StObject.set(x, "pid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPpid(value: Double): Self = StObject.set(x, "ppid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUid(value: Double): Self = StObject.set(x, "uid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUidUndefined: Self = StObject.set(x, "uid", js.undefined)
    }
  }
}
