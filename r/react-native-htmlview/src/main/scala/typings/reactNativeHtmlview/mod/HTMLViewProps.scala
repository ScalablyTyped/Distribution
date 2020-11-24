package typings.reactNativeHtmlview.mod

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.ComponentType
import typings.react.mod.ReactNode
import typings.reactNative.mod.ImageStyle
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.TextProperties
import typings.reactNative.mod.TextStyle
import typings.reactNative.mod.ViewProperties
import typings.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HTMLViewProps extends js.Object {
  
  /*
    * The component used for rendering HTML element nodes
    */
  var NodeComponent: js.UndefOr[ComponentType[js.Object]] = js.native
  
  /*
    * The root wrapper component
    */
  var RootComponent: js.UndefOr[ComponentType[js.Object]] = js.native
  
  /*
    * The component used for rendering text element nodes
    */
  var TextComponent: js.UndefOr[ComponentType[js.Object]] = js.native
  
  /**
    *  When explicitly false, effectively sets paragraphBreak and lineBreak to null
    */
  var addLineBreaks: js.UndefOr[Boolean] = js.native
  
  /**
    * Text which is rendered before every li inside a ul
    */
  var bullet: js.UndefOr[String] = js.native
  
  /**
    * Text which appears after text elements which create a new line (br, headings)
    */
  var lineBreak: js.UndefOr[String] = js.native
  
  /*
    * Properties for the NodeComponent, can be used independently from NodeComponent
    */
  var nodeComponentProps: js.UndefOr[TextProperties] = js.native
  
  var onLinkLongPress: js.UndefOr[js.Function1[/* url */ String, Unit]] = js.native
  
  var onLinkPress: js.UndefOr[js.Function1[/* url */ String, Unit]] = js.native
  
  /**
    * Text which appears after every p element
    */
  var paragraphBreak: js.UndefOr[String] = js.native
  
  /**
    *
    * A custom function to render HTML nodes however you see fit. If the function returns undefined (not null), the
    * default renderer will be used for that node. The function takes the following arguments:
    *
    *  - defaultRenderer the default rendering implementation, so you can use the normal rendering logic for some subtree. defaultRenderer takes the following arguments:
    *     - node the node to render with the default rendering logic
    *     - parent the parent of node of node
    *
    * @param node the html node as parsed by htmlparser2
    * @param index position of the node in parent node's children
    * @param siblings parent node's children (including current node)
    * @param parent parent node
    * @param defaultRenderer the default rendering implementation, so you can use the normal rendering logic for some subtree:
    */
  var renderNode: js.UndefOr[
    js.Function5[
      /* node */ HTMLViewNode, 
      /* index */ Double, 
      /* siblings */ HTMLViewNode, 
      /* parent */ HTMLViewNode, 
      /* defaultRenderer */ js.Function2[/* node */ HTMLViewNode, /* parent */ HTMLViewNode, ReactNode], 
      ReactNode
    ]
  ] = js.native
  
  /*
    * Properties for the RootComponent, can be used independently from RootComponent
    */
  var rootComponentProps: js.UndefOr[ViewProperties] = js.native
  
  var stylesheet: js.UndefOr[StringDictionary[StyleProp[ViewStyle | TextStyle | ImageStyle]]] = js.native
  
  /*
    * Properties for the TextComponent, can be used independently from TextComponent
    */
  var textComponentProps: js.UndefOr[TextProperties] = js.native
  
  /**
    * a string of HTML content to render
    */
  var value: String = js.native
}
object HTMLViewProps {
  
  @scala.inline
  def apply(value: String): HTMLViewProps = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[HTMLViewProps]
  }
  
  @scala.inline
  implicit class HTMLViewPropsOps[Self <: HTMLViewProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodeComponent(value: ComponentType[js.Object]): Self = this.set("NodeComponent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNodeComponent: Self = this.set("NodeComponent", js.undefined)
    
    @scala.inline
    def setRootComponent(value: ComponentType[js.Object]): Self = this.set("RootComponent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRootComponent: Self = this.set("RootComponent", js.undefined)
    
    @scala.inline
    def setTextComponent(value: ComponentType[js.Object]): Self = this.set("TextComponent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextComponent: Self = this.set("TextComponent", js.undefined)
    
    @scala.inline
    def setAddLineBreaks(value: Boolean): Self = this.set("addLineBreaks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAddLineBreaks: Self = this.set("addLineBreaks", js.undefined)
    
    @scala.inline
    def setBullet(value: String): Self = this.set("bullet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBullet: Self = this.set("bullet", js.undefined)
    
    @scala.inline
    def setLineBreak(value: String): Self = this.set("lineBreak", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLineBreak: Self = this.set("lineBreak", js.undefined)
    
    @scala.inline
    def setNodeComponentProps(value: TextProperties): Self = this.set("nodeComponentProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNodeComponentProps: Self = this.set("nodeComponentProps", js.undefined)
    
    @scala.inline
    def setOnLinkLongPress(value: /* url */ String => Unit): Self = this.set("onLinkLongPress", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnLinkLongPress: Self = this.set("onLinkLongPress", js.undefined)
    
    @scala.inline
    def setOnLinkPress(value: /* url */ String => Unit): Self = this.set("onLinkPress", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnLinkPress: Self = this.set("onLinkPress", js.undefined)
    
    @scala.inline
    def setParagraphBreak(value: String): Self = this.set("paragraphBreak", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParagraphBreak: Self = this.set("paragraphBreak", js.undefined)
    
    @scala.inline
    def setRenderNode(
      value: (/* node */ HTMLViewNode, /* index */ Double, /* siblings */ HTMLViewNode, /* parent */ HTMLViewNode, /* defaultRenderer */ js.Function2[/* node */ HTMLViewNode, /* parent */ HTMLViewNode, ReactNode]) => ReactNode
    ): Self = this.set("renderNode", js.Any.fromFunction5(value))
    
    @scala.inline
    def deleteRenderNode: Self = this.set("renderNode", js.undefined)
    
    @scala.inline
    def setRootComponentProps(value: ViewProperties): Self = this.set("rootComponentProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRootComponentProps: Self = this.set("rootComponentProps", js.undefined)
    
    @scala.inline
    def setStylesheet(value: StringDictionary[StyleProp[ViewStyle | TextStyle | ImageStyle]]): Self = this.set("stylesheet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStylesheet: Self = this.set("stylesheet", js.undefined)
    
    @scala.inline
    def setTextComponentProps(value: TextProperties): Self = this.set("textComponentProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextComponentProps: Self = this.set("textComponentProps", js.undefined)
  }
}
