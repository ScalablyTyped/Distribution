package typings.sinclairTypebox

import typings.sinclairTypebox.formatFormatMod.FormatValidationFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object formatMod {
  
  object Format {
    
    @JSImport("@sinclair/typebox/format", "Format")
    @js.native
    val ^ : js.Any = js.native
    
    /** Clears all formats */
    inline def Clear(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("Clear")().asInstanceOf[Unit]
    
    /** Gets a string format validation function */
    inline def Get(format: String): js.UndefOr[FormatValidationFunction] = ^.asInstanceOf[js.Dynamic].applyDynamic("Get")(format.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[FormatValidationFunction]]
    
    /** Returns true if the string format exists */
    inline def Has(format: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("Has")(format.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    /** Sets a string format validation function */
    inline def Set(format: String, func: FormatValidationFunction): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("Set")(format.asInstanceOf[js.Any], func.asInstanceOf[js.Any])).asInstanceOf[Unit]
  }
}
