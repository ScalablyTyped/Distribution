package typings.reactDocgenTypescriptPlugin

import typings.reactDocgenTypescriptPlugin.pluginMod.DocgenPlugin
import typings.reactDocgenTypescriptPlugin.pluginMod.DocgenPluginType
import typings.reactDocgenTypescriptPlugin.pluginMod.PluginOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-docgen-typescript-plugin/dist", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("react-docgen-typescript-plugin/dist", JSImport.Default)
  @js.native
  class default ()
    extends StObject
       with DocgenPlugin {
    def this(options: PluginOptions) = this()
    
    /* CompleteClass */
    @JSName("apply")
    override def apply(
      compiler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.Compiler */ js.Any
    ): Unit = js.native
    
    /* private */ /* CompleteClass */
    var name: js.Any = js.native
    
    /* private */ /* CompleteClass */
    var options: js.Any = js.native
  }
  @JSImport("react-docgen-typescript-plugin/dist", JSImport.Default)
  @js.native
  def default: DocgenPluginType = js.native
  inline def default_=(x: DocgenPluginType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("default")(x.asInstanceOf[js.Any])
}
