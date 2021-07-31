package typings.reactMd.mod

import typings.react.mod.ReactElement
import typings.reactMdUtils.interactionModeMod.InteractionModeListenerProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object InteractionModeListener {
  
  @scala.inline
  def apply(hasChildren: InteractionModeListenerProps): ReactElement = ^.asInstanceOf[js.Dynamic].apply(hasChildren.asInstanceOf[js.Any]).asInstanceOf[ReactElement]
  
  @JSImport("react-md", "InteractionModeListener")
  @js.native
  val ^ : js.Any = js.native
  
  object propTypes {
    
    @JSImport("react-md", "InteractionModeListener.propTypes")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-md", "InteractionModeListener.propTypes.children")
    @js.native
    def children: js.Any = js.native
    @scala.inline
    def children_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("children")(x.asInstanceOf[js.Any])
  }
}
