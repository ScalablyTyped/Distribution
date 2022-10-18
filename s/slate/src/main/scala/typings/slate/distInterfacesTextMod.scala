package typings.slate

import typings.slate.distInterfacesCustomTypesMod.ExtendedType
import typings.slate.distInterfacesRangeMod.Range
import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distInterfacesTextMod {
  
  @JSImport("slate/dist/interfaces/text", "Text")
  @js.native
  val Text: TextInterface = js.native
  type Text = ExtendedType[typings.slate.slateStrings.Text, BaseText]
  
  trait BaseText extends StObject {
    
    var text: String
  }
  object BaseText {
    
    inline def apply(text: String): BaseText = {
      val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[BaseText]
    }
    
    extension [Self <: BaseText](x: Self) {
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    }
  }
  
  trait TextEqualsOptions extends StObject {
    
    var loose: js.UndefOr[Boolean] = js.undefined
  }
  object TextEqualsOptions {
    
    inline def apply(): TextEqualsOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TextEqualsOptions]
    }
    
    extension [Self <: TextEqualsOptions](x: Self) {
      
      inline def setLoose(value: Boolean): Self = StObject.set(x, "loose", value.asInstanceOf[js.Any])
      
      inline def setLooseUndefined: Self = StObject.set(x, "loose", js.undefined)
    }
  }
  
  @js.native
  trait TextInterface extends StObject {
    
    def decorations(node: typings.slate.distInterfacesTextMod.Text, decorations: js.Array[Range]): js.Array[typings.slate.distInterfacesTextMod.Text] = js.native
    
    def equals(text: typings.slate.distInterfacesTextMod.Text, another: typings.slate.distInterfacesTextMod.Text): Boolean = js.native
    def equals(
      text: typings.slate.distInterfacesTextMod.Text,
      another: typings.slate.distInterfacesTextMod.Text,
      options: TextEqualsOptions
    ): Boolean = js.native
    
    def isText(value: Any): /* is slate.slate/dist/interfaces/text.Text */ Boolean = js.native
    
    def isTextList(value: Any): /* is std.Array<slate.slate/dist/interfaces/text.Text> */ Boolean = js.native
    
    def isTextProps(props: Any): /* is std.Partial<slate.slate/dist/interfaces/text.Text> */ Boolean = js.native
    
    def matches(
      text: typings.slate.distInterfacesTextMod.Text,
      props: Partial[typings.slate.distInterfacesTextMod.Text]
    ): Boolean = js.native
  }
}
