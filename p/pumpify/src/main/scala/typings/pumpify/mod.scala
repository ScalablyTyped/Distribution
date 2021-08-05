package typings.pumpify

import org.scalablytyped.runtime.Instantiable1
import typings.duplexify.mod.Duplexify
import typings.node.streamMod.Stream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("pumpify", JSImport.Namespace)
  @js.native
  class ^ protected () extends Pumpify {
    def this(streams: Stream*) = this()
    def this(streams: js.Array[Stream]) = this()
  }
  @JSImport("pumpify", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def ctor(opts: PumpifyFactoryOptions): Instantiable1[/* streams (repeated) */ Stream, Pumpify] = ^.asInstanceOf[js.Dynamic].applyDynamic("ctor")(opts.asInstanceOf[js.Any]).asInstanceOf[Instantiable1[/* streams (repeated) */ Stream, Pumpify]]
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("pumpify", "obj")
  @js.native
  class obj protected () extends Pumpify {
    def this(streams: Stream*) = this()
  }
  @JSImport("pumpify", "obj")
  @js.native
  def obj: Instantiable1[/* streams (repeated) */ Stream, Pumpify] = js.native
  inline def obj_=(x: Instantiable1[/* streams (repeated) */ Stream, Pumpify]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("obj")(x.asInstanceOf[js.Any])
  
  @js.native
  trait Pumpify extends Duplexify {
    
    def setPipeline(streams: Stream*): Unit = js.native
    def setPipeline(streams: js.Array[Stream]): Unit = js.native
  }
  
  trait PumpifyFactoryOptions extends StObject {
    
    var autoDestroy: Boolean
    
    var destroy: Boolean
    
    var highWaterMark: Double
    
    var objectMode: Boolean
  }
  object PumpifyFactoryOptions {
    
    inline def apply(autoDestroy: Boolean, destroy: Boolean, highWaterMark: Double, objectMode: Boolean): PumpifyFactoryOptions = {
      val __obj = js.Dynamic.literal(autoDestroy = autoDestroy.asInstanceOf[js.Any], destroy = destroy.asInstanceOf[js.Any], highWaterMark = highWaterMark.asInstanceOf[js.Any], objectMode = objectMode.asInstanceOf[js.Any])
      __obj.asInstanceOf[PumpifyFactoryOptions]
    }
    
    extension [Self <: PumpifyFactoryOptions](x: Self) {
      
      inline def setAutoDestroy(value: Boolean): Self = StObject.set(x, "autoDestroy", value.asInstanceOf[js.Any])
      
      inline def setDestroy(value: Boolean): Self = StObject.set(x, "destroy", value.asInstanceOf[js.Any])
      
      inline def setHighWaterMark(value: Double): Self = StObject.set(x, "highWaterMark", value.asInstanceOf[js.Any])
      
      inline def setObjectMode(value: Boolean): Self = StObject.set(x, "objectMode", value.asInstanceOf[js.Any])
    }
  }
}
