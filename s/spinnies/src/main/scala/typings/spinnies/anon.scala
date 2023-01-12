package typings.spinnies

import typings.spinnies.mod.Color
import typings.spinnies.mod.Spinner
import typings.spinnies.mod.SpinnerStatus
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Partial<spinnies.spinnies.Options> */
  trait PartialOptions extends StObject {
    
    var color: js.UndefOr[Color] = js.undefined
    
    var disableSpins: js.UndefOr[Boolean] = js.undefined
    
    var failColor: js.UndefOr[Color] = js.undefined
    
    var failPrefix: js.UndefOr[String] = js.undefined
    
    var spinner: js.UndefOr[Spinner] = js.undefined
    
    var spinnerColor: js.UndefOr[Color] = js.undefined
    
    var succeedColor: js.UndefOr[Color] = js.undefined
    
    var succeedPrefix: js.UndefOr[String] = js.undefined
  }
  object PartialOptions {
    
    inline def apply(): PartialOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PartialOptions] (val x: Self) extends AnyVal {
      
      inline def setColor(value: Color): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setDisableSpins(value: Boolean): Self = StObject.set(x, "disableSpins", value.asInstanceOf[js.Any])
      
      inline def setDisableSpinsUndefined: Self = StObject.set(x, "disableSpins", js.undefined)
      
      inline def setFailColor(value: Color): Self = StObject.set(x, "failColor", value.asInstanceOf[js.Any])
      
      inline def setFailColorUndefined: Self = StObject.set(x, "failColor", js.undefined)
      
      inline def setFailPrefix(value: String): Self = StObject.set(x, "failPrefix", value.asInstanceOf[js.Any])
      
      inline def setFailPrefixUndefined: Self = StObject.set(x, "failPrefix", js.undefined)
      
      inline def setSpinner(value: Spinner): Self = StObject.set(x, "spinner", value.asInstanceOf[js.Any])
      
      inline def setSpinnerColor(value: Color): Self = StObject.set(x, "spinnerColor", value.asInstanceOf[js.Any])
      
      inline def setSpinnerColorUndefined: Self = StObject.set(x, "spinnerColor", js.undefined)
      
      inline def setSpinnerUndefined: Self = StObject.set(x, "spinner", js.undefined)
      
      inline def setSucceedColor(value: Color): Self = StObject.set(x, "succeedColor", value.asInstanceOf[js.Any])
      
      inline def setSucceedColorUndefined: Self = StObject.set(x, "succeedColor", js.undefined)
      
      inline def setSucceedPrefix(value: String): Self = StObject.set(x, "succeedPrefix", value.asInstanceOf[js.Any])
      
      inline def setSucceedPrefixUndefined: Self = StObject.set(x, "succeedPrefix", js.undefined)
    }
  }
  
  /* Inlined std.Partial<spinnies.spinnies.SpinnerOptions> */
  trait PartialSpinnerOptions extends StObject {
    
    var color: js.UndefOr[Color] = js.undefined
    
    var failColor: js.UndefOr[Color] = js.undefined
    
    var indent: js.UndefOr[Double] = js.undefined
    
    var spinnerColor: js.UndefOr[Color] = js.undefined
    
    var status: js.UndefOr[SpinnerStatus] = js.undefined
    
    var succeedColor: js.UndefOr[Color] = js.undefined
    
    var text: js.UndefOr[String] = js.undefined
  }
  object PartialSpinnerOptions {
    
    inline def apply(): PartialSpinnerOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialSpinnerOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PartialSpinnerOptions] (val x: Self) extends AnyVal {
      
      inline def setColor(value: Color): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setFailColor(value: Color): Self = StObject.set(x, "failColor", value.asInstanceOf[js.Any])
      
      inline def setFailColorUndefined: Self = StObject.set(x, "failColor", js.undefined)
      
      inline def setIndent(value: Double): Self = StObject.set(x, "indent", value.asInstanceOf[js.Any])
      
      inline def setIndentUndefined: Self = StObject.set(x, "indent", js.undefined)
      
      inline def setSpinnerColor(value: Color): Self = StObject.set(x, "spinnerColor", value.asInstanceOf[js.Any])
      
      inline def setSpinnerColorUndefined: Self = StObject.set(x, "spinnerColor", js.undefined)
      
      inline def setStatus(value: SpinnerStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
      
      inline def setSucceedColor(value: Color): Self = StObject.set(x, "succeedColor", value.asInstanceOf[js.Any])
      
      inline def setSucceedColorUndefined: Self = StObject.set(x, "succeedColor", js.undefined)
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    }
  }
}
