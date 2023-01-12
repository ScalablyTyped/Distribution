package typings.reactTwemoji

import typings.react.mod.Component
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-twemoji", JSImport.Default)
  @js.native
  open class default ()
    extends Component[TwemojiProps, js.Object, Any]
  
  type Twemoji = Component[TwemojiProps, js.Object, Any]
  
  trait TwemojiProps extends StObject {
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    /**
      * When it is true, Twemoji will not render a wrapping element (with tag)
      * to contain its children. Note that since twemoji.parse needs a DOM element
      * reference, any direct pure text child of Twemoji is not parsed when
      * noWrapper is true. E.g. foo in
      * <Twemoji noWrapper={true}>foo<p>bar</p></Twemoji> is not parsed.
      */
    var noWrapper: js.UndefOr[Boolean] = js.undefined
    
    /**
      * twemoji.parse options.
      */
    var options: js.UndefOr[js.Object] = js.undefined
    
    /**
      * The tag of the wrapping element. This option is ignored when noWrapper is
      * true.
      */
    var tag: js.UndefOr[String] = js.undefined
  }
  object TwemojiProps {
    
    inline def apply(): TwemojiProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TwemojiProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TwemojiProps] (val x: Self) extends AnyVal {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setNoWrapper(value: Boolean): Self = StObject.set(x, "noWrapper", value.asInstanceOf[js.Any])
      
      inline def setNoWrapperUndefined: Self = StObject.set(x, "noWrapper", js.undefined)
      
      inline def setOptions(value: js.Object): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
      
      inline def setTag(value: String): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
      
      inline def setTagUndefined: Self = StObject.set(x, "tag", js.undefined)
    }
  }
}
