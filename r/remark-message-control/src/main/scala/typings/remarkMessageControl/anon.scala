package typings.remarkMessageControl

import typings.remarkMessageControl.mod.Options
import typings.remarkMessageControl.remarkMessageControlBooleans.`false`
import typings.remarkMessageControl.remarkMessageControlBooleans.`true`
import typings.unifiedMessageControl.mod.Test
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Omit<unified-message-control.unified-message-control.OptionsWithReset, 'marker'> */
  trait OmitOptionsWithResetmarke
    extends StObject
       with Options {
    
    var enable: js.UndefOr[js.Array[String]] = js.undefined
    
    var known: js.UndefOr[js.Array[String]] = js.undefined
    
    var name: String
    
    var reset: `true`
    
    var source: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var test: js.UndefOr[Test] = js.undefined
  }
  object OmitOptionsWithResetmarke {
    
    inline def apply(name: String): OmitOptionsWithResetmarke = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], reset = true)
      __obj.asInstanceOf[OmitOptionsWithResetmarke]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: OmitOptionsWithResetmarke] (val x: Self) extends AnyVal {
      
      inline def setEnable(value: js.Array[String]): Self = StObject.set(x, "enable", value.asInstanceOf[js.Any])
      
      inline def setEnableUndefined: Self = StObject.set(x, "enable", js.undefined)
      
      inline def setEnableVarargs(value: String*): Self = StObject.set(x, "enable", js.Array(value*))
      
      inline def setKnown(value: js.Array[String]): Self = StObject.set(x, "known", value.asInstanceOf[js.Any])
      
      inline def setKnownUndefined: Self = StObject.set(x, "known", js.undefined)
      
      inline def setKnownVarargs(value: String*): Self = StObject.set(x, "known", js.Array(value*))
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setReset(value: `true`): Self = StObject.set(x, "reset", value.asInstanceOf[js.Any])
      
      inline def setSource(value: String | js.Array[String]): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
      
      inline def setSourceVarargs(value: String*): Self = StObject.set(x, "source", js.Array(value*))
      
      inline def setTest(value: Test): Self = StObject.set(x, "test", value.asInstanceOf[js.Any])
      
      inline def setTestUndefined: Self = StObject.set(x, "test", js.undefined)
    }
  }
  
  /* Inlined std.Omit<unified-message-control.unified-message-control.OptionsWithoutReset, 'marker'> */
  trait OmitOptionsWithoutResetma
    extends StObject
       with Options {
    
    var disable: js.UndefOr[js.Array[String]] = js.undefined
    
    var known: js.UndefOr[js.Array[String]] = js.undefined
    
    var name: String
    
    var reset: js.UndefOr[`false`] = js.undefined
    
    var source: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var test: js.UndefOr[Test] = js.undefined
  }
  object OmitOptionsWithoutResetma {
    
    inline def apply(name: String): OmitOptionsWithoutResetma = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[OmitOptionsWithoutResetma]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: OmitOptionsWithoutResetma] (val x: Self) extends AnyVal {
      
      inline def setDisable(value: js.Array[String]): Self = StObject.set(x, "disable", value.asInstanceOf[js.Any])
      
      inline def setDisableUndefined: Self = StObject.set(x, "disable", js.undefined)
      
      inline def setDisableVarargs(value: String*): Self = StObject.set(x, "disable", js.Array(value*))
      
      inline def setKnown(value: js.Array[String]): Self = StObject.set(x, "known", value.asInstanceOf[js.Any])
      
      inline def setKnownUndefined: Self = StObject.set(x, "known", js.undefined)
      
      inline def setKnownVarargs(value: String*): Self = StObject.set(x, "known", js.Array(value*))
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setReset(value: `false`): Self = StObject.set(x, "reset", value.asInstanceOf[js.Any])
      
      inline def setResetUndefined: Self = StObject.set(x, "reset", js.undefined)
      
      inline def setSource(value: String | js.Array[String]): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
      
      inline def setSourceVarargs(value: String*): Self = StObject.set(x, "source", js.Array(value*))
      
      inline def setTest(value: Test): Self = StObject.set(x, "test", value.asInstanceOf[js.Any])
      
      inline def setTestUndefined: Self = StObject.set(x, "test", js.undefined)
    }
  }
}
