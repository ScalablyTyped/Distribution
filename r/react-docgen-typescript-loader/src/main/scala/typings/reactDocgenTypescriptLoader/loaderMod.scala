package typings.reactDocgenTypescriptLoader

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object loaderMod {
  
  @JSImport("react-docgen-typescript-loader/dist/loader", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(source: String): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(source.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[String]]
  
  trait TSFile extends StObject {
    
    var text: js.UndefOr[String] = js.undefined
    
    var version: Double
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
