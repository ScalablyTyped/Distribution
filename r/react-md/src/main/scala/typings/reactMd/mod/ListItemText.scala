package typings.reactMd.mod

import typings.react.mod.ReactElement
import typings.reactMdList.listItemTextMod.ListItemTextProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ListItemText {
  
  @scala.inline
  def apply(hasClassNameSecondaryTextClassNameSecondaryTextChildren: ListItemTextProps): ReactElement = ^.asInstanceOf[js.Dynamic].apply(hasClassNameSecondaryTextClassNameSecondaryTextChildren.asInstanceOf[js.Any]).asInstanceOf[ReactElement]
  
  @JSImport("react-md", "ListItemText")
  @js.native
  val ^ : js.Any = js.native
  
  object propTypes {
    
    @JSImport("react-md", "ListItemText.propTypes")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-md", "ListItemText.propTypes.children")
    @js.native
    def children: js.Any = js.native
    @scala.inline
    def children_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("children")(x.asInstanceOf[js.Any])
    
    @JSImport("react-md", "ListItemText.propTypes.className")
    @js.native
    def className: js.Any = js.native
    @scala.inline
    def className_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("className")(x.asInstanceOf[js.Any])
    
    @JSImport("react-md", "ListItemText.propTypes.secondaryText")
    @js.native
    def secondaryText: js.Any = js.native
    
    @JSImport("react-md", "ListItemText.propTypes.secondaryTextClassName")
    @js.native
    def secondaryTextClassName: js.Any = js.native
    @scala.inline
    def secondaryTextClassName_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("secondaryTextClassName")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def secondaryText_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("secondaryText")(x.asInstanceOf[js.Any])
  }
}
