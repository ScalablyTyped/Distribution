package typings.reactLoadable

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object webpackMod {
  
  @JSImport("react-loadable/webpack", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.Plugin * / any */ @JSImport("react-loadable/webpack", "ReactLoadablePlugin")
  @js.native
  class ReactLoadablePlugin () extends StObject {
    def this(opts: ReactLoadablePluginOptions) = this()
  }
  
  @scala.inline
  def getBundles(manifest: Manifest, moduleIds: js.Array[String]): js.Array[Bundle] = (^.asInstanceOf[js.Dynamic].applyDynamic("getBundles")(manifest.asInstanceOf[js.Any], moduleIds.asInstanceOf[js.Any])).asInstanceOf[js.Array[Bundle]]
  
  trait Bundle extends StObject {
    
    var file: String
    
    var id: String
    
    var name: String | Null
    
    var publicPath: String
  }
  object Bundle {
    
    @scala.inline
    def apply(file: String, id: String, publicPath: String): Bundle = {
      val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], publicPath = publicPath.asInstanceOf[js.Any], name = null)
      __obj.asInstanceOf[Bundle]
    }
    
    @scala.inline
    implicit class BundleMutableBuilder[Self <: Bundle] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFile(value: String): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameNull: Self = StObject.set(x, "name", null)
      
      @scala.inline
      def setPublicPath(value: String): Self = StObject.set(x, "publicPath", value.asInstanceOf[js.Any])
    }
  }
  
  type Manifest = StringDictionary[js.Array[Bundle]]
  
  trait ReactLoadablePluginOptions extends StObject {
    
    var filename: String
  }
  object ReactLoadablePluginOptions {
    
    @scala.inline
    def apply(filename: String): ReactLoadablePluginOptions = {
      val __obj = js.Dynamic.literal(filename = filename.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReactLoadablePluginOptions]
    }
    
    @scala.inline
    implicit class ReactLoadablePluginOptionsMutableBuilder[Self <: ReactLoadablePluginOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
    }
  }
}
