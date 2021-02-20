package typings.reactDocgenTypescriptLoader

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object loaderMod {
  
  @JSImport("react-docgen-typescript-loader/dist/loader", JSImport.Default)
  @js.native
  def default(source: String): js.UndefOr[String] = js.native
  
  @js.native
  trait TSFile extends StObject {
    
    var text: js.UndefOr[String] = js.native
    
    var version: Double = js.native
  }
  object TSFile {
    
    @scala.inline
    def apply(version: Double): TSFile = {
      val __obj = js.Dynamic.literal(version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[TSFile]
    }
    
    @scala.inline
    implicit class TSFileMutableBuilder[Self <: TSFile] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      
      @scala.inline
      def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
}
