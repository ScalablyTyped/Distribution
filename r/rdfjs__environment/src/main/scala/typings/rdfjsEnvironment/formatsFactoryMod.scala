package typings.rdfjsEnvironment

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object formatsFactoryMod extends Shortcut {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("@rdfjs/environment/FormatsFactory", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with FormatsFactory {
    
    /* CompleteClass */
    override def clone(original: FormatsFactory): Unit = js.native
    
    /* CompleteClass */
    var formats: typings.rdfjsEnvironment.libFormatsMod.default = js.native
    
    /* CompleteClass */
    override def init(): Unit = js.native
  }
  @JSImport("@rdfjs/environment/FormatsFactory", JSImport.Default)
  @js.native
  val default: FormatsFactoryCtor = js.native
  
  trait FormatsFactory extends StObject {
    
    def clone(original: FormatsFactory): Unit
    
    var formats: typings.rdfjsEnvironment.libFormatsMod.default
    
    def init(): Unit
  }
  object FormatsFactory {
    
    inline def apply(
      clone_ : FormatsFactory => Unit,
      formats: typings.rdfjsEnvironment.libFormatsMod.default,
      init: () => Unit
    ): FormatsFactory = {
      val __obj = js.Dynamic.literal(formats = formats.asInstanceOf[js.Any], init = js.Any.fromFunction0(init))
      __obj.updateDynamic("clone")(js.Any.fromFunction1(clone_))
      __obj.asInstanceOf[FormatsFactory]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FormatsFactory] (val x: Self) extends AnyVal {
      
      inline def setClone_(value: FormatsFactory => Unit): Self = StObject.set(x, "clone", js.Any.fromFunction1(value))
      
      inline def setFormats(value: typings.rdfjsEnvironment.libFormatsMod.default): Self = StObject.set(x, "formats", value.asInstanceOf[js.Any])
      
      inline def setInit(value: () => Unit): Self = StObject.set(x, "init", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait FormatsFactoryCtor
    extends StObject
       with Instantiable0[FormatsFactory]
  
  type _To = FormatsFactoryCtor
  
  /* This means you don't have to write `default`, but can instead just say `formatsFactoryMod.foo` */
  override def _to: FormatsFactoryCtor = default
}
