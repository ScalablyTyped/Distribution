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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("r-script", JSImport.Namespace)
  @js.native
  def apply(scriptPath: String): R = js.native
  
  @js.native
  trait Options
    extends /* key */ StringDictionary[js.Any] {
    
    var Date: js.UndefOr[ISO8601 | epoch] = js.native
    
    var POSIXt: js.UndefOr[string | ISO8601 | epoch | mongo] = js.native
    
    var auto_unbox: js.UndefOr[Boolean] = js.native
    
    var complex: js.UndefOr[string | list] = js.native
    
    var dataframe: js.UndefOr[rows | colums | values] = js.native
    
    var digits: js.UndefOr[Double] = js.native
    
    var factor: js.UndefOr[string | integer] = js.native
    
    var force: js.UndefOr[Boolean] = js.native
    
    var matrix: js.UndefOr[rowmajor | columnmajor] = js.native
    
    var na: js.UndefOr[`null` | string] = js.native
    
    var `null`: js.UndefOr[list | typings.rScript.rScriptStrings.`null`] = js.native
    
    var pretty: js.UndefOr[Boolean] = js.native
    
    var raw: js.UndefOr[base64 | hex | mongo] = js.native
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
      def setAuto_unbox(value: Boolean): Self = StObject.set(x, "auto_unbox", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAuto_unboxUndefined: Self = StObject.set(x, "auto_unbox", js.undefined)
      
      @scala.inline
      def setComplex(value: string | list): Self = StObject.set(x, "complex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComplexUndefined: Self = StObject.set(x, "complex", js.undefined)
      
      @scala.inline
      def setDataframe(value: rows | colums | values): Self = StObject.set(x, "dataframe", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataframeUndefined: Self = StObject.set(x, "dataframe", js.undefined)
      
      @scala.inline
      def setDate(value: ISO8601 | epoch): Self = StObject.set(x, "Date", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDateUndefined: Self = StObject.set(x, "Date", js.undefined)
      
      @scala.inline
      def setDigits(value: Double): Self = StObject.set(x, "digits", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDigitsUndefined: Self = StObject.set(x, "digits", js.undefined)
      
      @scala.inline
      def setFactor(value: string | integer): Self = StObject.set(x, "factor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFactorUndefined: Self = StObject.set(x, "factor", js.undefined)
      
      @scala.inline
      def setForce(value: Boolean): Self = StObject.set(x, "force", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setForceUndefined: Self = StObject.set(x, "force", js.undefined)
      
      @scala.inline
      def setMatrix(value: rowmajor | columnmajor): Self = StObject.set(x, "matrix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMatrixUndefined: Self = StObject.set(x, "matrix", js.undefined)
      
      @scala.inline
      def setNa(value: `null` | string): Self = StObject.set(x, "na", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNaUndefined: Self = StObject.set(x, "na", js.undefined)
      
      @scala.inline
      def setNull(value: list | `null`): Self = StObject.set(x, "null", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNullUndefined: Self = StObject.set(x, "null", js.undefined)
      
      @scala.inline
      def setPOSIXt(value: string | ISO8601 | epoch | mongo): Self = StObject.set(x, "POSIXt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPOSIXtUndefined: Self = StObject.set(x, "POSIXt", js.undefined)
      
      @scala.inline
      def setPretty(value: Boolean): Self = StObject.set(x, "pretty", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrettyUndefined: Self = StObject.set(x, "pretty", js.undefined)
      
      @scala.inline
      def setRaw(value: base64 | hex | mongo): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRawUndefined: Self = StObject.set(x, "raw", js.undefined)
    }
  }
  
  @js.native
  trait R extends StObject {
    
    def call(callback: js.Function2[/* err */ js.Any, /* d */ js.Any, Unit]): Unit = js.native
    def call(options: Options, callback: js.Function2[/* err */ js.Any, /* d */ js.Any, Unit]): Unit = js.native
    
    def callSync(): js.Any = js.native
    def callSync(options: Options): js.Any = js.native
    
    def data(args: js.Any*): this.type = js.native
  }
}
