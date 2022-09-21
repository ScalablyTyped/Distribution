package typings.rScript

import org.scalablytyped.runtime.StringDictionary
import typings.rScript.rScriptStrings.ISO8601
import typings.rScript.rScriptStrings.`null`
import typings.rScript.rScriptStrings.base64
import typings.rScript.rScriptStrings.columnmajor
import typings.rScript.rScriptStrings.colums
import typings.rScript.rScriptStrings.epoch
import typings.rScript.rScriptStrings.hex
import typings.rScript.rScriptStrings.integer
import typings.rScript.rScriptStrings.list
import typings.rScript.rScriptStrings.mongo
import typings.rScript.rScriptStrings.rowmajor
import typings.rScript.rScriptStrings.rows
import typings.rScript.rScriptStrings.string
import typings.rScript.rScriptStrings.values
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(scriptPath: String): R = ^.asInstanceOf[js.Dynamic].apply(scriptPath.asInstanceOf[js.Any]).asInstanceOf[R]
  
  @JSImport("r-script", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait Options
    extends StObject
       with /* key */ StringDictionary[Any] {
    
    var Date: js.UndefOr[ISO8601 | epoch] = js.undefined
    
    var POSIXt: js.UndefOr[string | ISO8601 | epoch | mongo] = js.undefined
    
    var auto_unbox: js.UndefOr[Boolean] = js.undefined
    
    var complex: js.UndefOr[string | list] = js.undefined
    
    var dataframe: js.UndefOr[rows | colums | values] = js.undefined
    
    var digits: js.UndefOr[Double] = js.undefined
    
    var factor: js.UndefOr[string | integer] = js.undefined
    
    var force: js.UndefOr[Boolean] = js.undefined
    
    var matrix: js.UndefOr[rowmajor | columnmajor] = js.undefined
    
    var na: js.UndefOr[`null` | string] = js.undefined
    
    var `null`: js.UndefOr[list | typings.rScript.rScriptStrings.`null`] = js.undefined
    
    var pretty: js.UndefOr[Boolean] = js.undefined
    
    var raw: js.UndefOr[base64 | hex | mongo] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setAuto_unbox(value: Boolean): Self = StObject.set(x, "auto_unbox", value.asInstanceOf[js.Any])
      
      inline def setAuto_unboxUndefined: Self = StObject.set(x, "auto_unbox", js.undefined)
      
      inline def setComplex(value: string | list): Self = StObject.set(x, "complex", value.asInstanceOf[js.Any])
      
      inline def setComplexUndefined: Self = StObject.set(x, "complex", js.undefined)
      
      inline def setDataframe(value: rows | colums | values): Self = StObject.set(x, "dataframe", value.asInstanceOf[js.Any])
      
      inline def setDataframeUndefined: Self = StObject.set(x, "dataframe", js.undefined)
      
      inline def setDate(value: ISO8601 | epoch): Self = StObject.set(x, "Date", value.asInstanceOf[js.Any])
      
      inline def setDateUndefined: Self = StObject.set(x, "Date", js.undefined)
      
      inline def setDigits(value: Double): Self = StObject.set(x, "digits", value.asInstanceOf[js.Any])
      
      inline def setDigitsUndefined: Self = StObject.set(x, "digits", js.undefined)
      
      inline def setFactor(value: string | integer): Self = StObject.set(x, "factor", value.asInstanceOf[js.Any])
      
      inline def setFactorUndefined: Self = StObject.set(x, "factor", js.undefined)
      
      inline def setForce(value: Boolean): Self = StObject.set(x, "force", value.asInstanceOf[js.Any])
      
      inline def setForceUndefined: Self = StObject.set(x, "force", js.undefined)
      
      inline def setMatrix(value: rowmajor | columnmajor): Self = StObject.set(x, "matrix", value.asInstanceOf[js.Any])
      
      inline def setMatrixUndefined: Self = StObject.set(x, "matrix", js.undefined)
      
      inline def setNa(value: `null` | string): Self = StObject.set(x, "na", value.asInstanceOf[js.Any])
      
      inline def setNaUndefined: Self = StObject.set(x, "na", js.undefined)
      
      inline def setNull(value: list | `null`): Self = StObject.set(x, "null", value.asInstanceOf[js.Any])
      
      inline def setNullUndefined: Self = StObject.set(x, "null", js.undefined)
      
      inline def setPOSIXt(value: string | ISO8601 | epoch | mongo): Self = StObject.set(x, "POSIXt", value.asInstanceOf[js.Any])
      
      inline def setPOSIXtUndefined: Self = StObject.set(x, "POSIXt", js.undefined)
      
      inline def setPretty(value: Boolean): Self = StObject.set(x, "pretty", value.asInstanceOf[js.Any])
      
      inline def setPrettyUndefined: Self = StObject.set(x, "pretty", js.undefined)
      
      inline def setRaw(value: base64 | hex | mongo): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
      
      inline def setRawUndefined: Self = StObject.set(x, "raw", js.undefined)
    }
  }
  
  @js.native
  trait R extends StObject {
    
    def call(callback: js.Function2[/* err */ Any, /* d */ Any, Unit]): Unit = js.native
    def call(options: Options, callback: js.Function2[/* err */ Any, /* d */ Any, Unit]): Unit = js.native
    
    def callSync(): Any = js.native
    def callSync(options: Options): Any = js.native
    
    def data(args: Any*): this.type = js.native
  }
}
