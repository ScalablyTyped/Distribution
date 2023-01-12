package typings.sketchapp

import typings.sketchapp.anon.App
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SketchMSMeta extends StObject {
  
  var app: String
  
  var appVersion: String
  
  var autosaved: Double
  
  var build: Double
  
  var commit: String
  
  var compatibilityVersion: Double
  
  var created: App
  
  var fonts: js.Array[String]
  
  var pagesAndArtboards: SketchMSPagesAndArtboards
  
  var saveHistory: js.Array[String]
  
  var variant: String
  
  var version: Double
}
object SketchMSMeta {
  
  inline def apply(
    app: String,
    appVersion: String,
    autosaved: Double,
    build: Double,
    commit: String,
    compatibilityVersion: Double,
    created: App,
    fonts: js.Array[String],
    pagesAndArtboards: SketchMSPagesAndArtboards,
    saveHistory: js.Array[String],
    variant: String,
    version: Double
  ): SketchMSMeta = {
    val __obj = js.Dynamic.literal(app = app.asInstanceOf[js.Any], appVersion = appVersion.asInstanceOf[js.Any], autosaved = autosaved.asInstanceOf[js.Any], build = build.asInstanceOf[js.Any], commit = commit.asInstanceOf[js.Any], compatibilityVersion = compatibilityVersion.asInstanceOf[js.Any], created = created.asInstanceOf[js.Any], fonts = fonts.asInstanceOf[js.Any], pagesAndArtboards = pagesAndArtboards.asInstanceOf[js.Any], saveHistory = saveHistory.asInstanceOf[js.Any], variant = variant.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[SketchMSMeta]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SketchMSMeta] (val x: Self) extends AnyVal {
    
    inline def setApp(value: String): Self = StObject.set(x, "app", value.asInstanceOf[js.Any])
    
    inline def setAppVersion(value: String): Self = StObject.set(x, "appVersion", value.asInstanceOf[js.Any])
    
    inline def setAutosaved(value: Double): Self = StObject.set(x, "autosaved", value.asInstanceOf[js.Any])
    
    inline def setBuild(value: Double): Self = StObject.set(x, "build", value.asInstanceOf[js.Any])
    
    inline def setCommit(value: String): Self = StObject.set(x, "commit", value.asInstanceOf[js.Any])
    
    inline def setCompatibilityVersion(value: Double): Self = StObject.set(x, "compatibilityVersion", value.asInstanceOf[js.Any])
    
    inline def setCreated(value: App): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
    
    inline def setFonts(value: js.Array[String]): Self = StObject.set(x, "fonts", value.asInstanceOf[js.Any])
    
    inline def setFontsVarargs(value: String*): Self = StObject.set(x, "fonts", js.Array(value*))
    
    inline def setPagesAndArtboards(value: SketchMSPagesAndArtboards): Self = StObject.set(x, "pagesAndArtboards", value.asInstanceOf[js.Any])
    
    inline def setSaveHistory(value: js.Array[String]): Self = StObject.set(x, "saveHistory", value.asInstanceOf[js.Any])
    
    inline def setSaveHistoryVarargs(value: String*): Self = StObject.set(x, "saveHistory", js.Array(value*))
    
    inline def setVariant(value: String): Self = StObject.set(x, "variant", value.asInstanceOf[js.Any])
    
    inline def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
