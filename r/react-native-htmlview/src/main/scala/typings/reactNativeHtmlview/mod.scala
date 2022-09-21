package typings.reactNativeHtmlview

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.ComponentType
import typings.react.mod.ReactNode
import typings.reactNative.mod.ImageStyle
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.TextProps
import typings.reactNative.mod.TextStyle
import typings.reactNative.mod.ViewProps
import typings.reactNative.mod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("react-native-htmlview", JSImport.Default)
  @js.native
  val default: ComponentType[HTMLViewProps] = js.native
  
  type GenericAttribs = StringDictionary[String]
  
  trait HTMLViewNode extends StObject {
    
    var attribs: GenericAttribs & SpecificAttribs
    
    var children: js.Array[HTMLViewNode]
    
    var data: js.UndefOr[String] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    var `type`: js.UndefOr[String] = js.undefined
  }
  object HTMLViewNode {
    
    inline def apply(attribs: GenericAttribs & SpecificAttribs, children: js.Array[HTMLViewNode]): HTMLViewNode = {
      val __obj = js.Dynamic.literal(attribs = attribs.asInstanceOf[js.Any], children = children.asInstanceOf[js.Any])
      __obj.asInstanceOf[HTMLViewNode]
    }
    
    extension [Self <: HTMLViewNode](x: Self) {
      
      inline def setAttribs(value: GenericAttribs & SpecificAttribs): Self = StObject.set(x, "attribs", value.asInstanceOf[js.Any])
      
      inline def setChildren(value: js.Array[HTMLViewNode]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenVarargs(value: HTMLViewNode*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  type HTMLViewNodeRenderer = js.Function2[/* node */ js.Array[HTMLViewNode], /* parent */ HTMLViewNode | Nullish, ReactNode]
  
  trait HTMLViewProps extends StObject {
    
    /*
      * The component used for rendering HTML element nodes
      */
    var NodeComponent: js.UndefOr[ComponentType[js.Object]] = js.undefined
    
    /*
      * The root wrapper component
      */
    var RootComponent: js.UndefOr[ComponentType[js.Object]] = js.undefined
    
    /*
      * The component used for rendering text element nodes
      */
    var TextComponent: js.UndefOr[ComponentType[js.Object]] = js.undefined
    
    /**
      *  When explicitly false, effectively sets paragraphBreak and lineBreak to null
      */
    var addLineBreaks: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Text which is rendered before every li inside a ul
      */
    var bullet: js.UndefOr[String] = js.undefined
    
    /**
      * Text which appears after text elements which create a new line (br, headings)
      */
    var lineBreak: js.UndefOr[String] = js.undefined
    
    /*
      * Properties for the NodeComponent, can be used independently from NodeComponent
      */
    var nodeComponentProps: js.UndefOr[TextProps] = js.undefined
    
    var onLinkLongPress: js.UndefOr[js.Function1[/* url */ String, Unit]] = js.undefined
    
    var onLinkPress: js.UndefOr[js.Function1[/* url */ String, Unit]] = js.undefined
    
    /**
      * Text which appears after every p element
      */
    var paragraphBreak: js.UndefOr[String] = js.undefined
    
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
          /* siblings */ js.Array[HTMLViewNode], 
          /* parent */ HTMLViewNode, 
          /* defaultRenderer */ HTMLViewNodeRenderer, 
          ReactNode
        ]
      ] = js.undefined
    
    /*
      * Properties for the RootComponent, can be used independently from RootComponent
      */
    var rootComponentProps: js.UndefOr[ViewProps] = js.undefined
    
    var stylesheet: js.UndefOr[StringDictionary[StyleProp[ViewStyle | TextStyle | ImageStyle]]] = js.undefined
    
    /*
      * Properties for the TextComponent, can be used independently from TextComponent
      */
    var textComponentProps: js.UndefOr[TextProps] = js.undefined
    
    /**
      * a string of HTML content to render
      */
    var value: String
  }
  object HTMLViewProps {
    
    inline def apply(value: String): HTMLViewProps = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[HTMLViewProps]
    }
    
    extension [Self <: HTMLViewProps](x: Self) {
      
      inline def setAddLineBreaks(value: Boolean): Self = StObject.set(x, "addLineBreaks", value.asInstanceOf[js.Any])
      
      inline def setAddLineBreaksUndefined: Self = StObject.set(x, "addLineBreaks", js.undefined)
      
      inline def setBullet(value: String): Self = StObject.set(x, "bullet", value.asInstanceOf[js.Any])
      
      inline def setBulletUndefined: Self = StObject.set(x, "bullet", js.undefined)
      
      inline def setLineBreak(value: String): Self = StObject.set(x, "lineBreak", value.asInstanceOf[js.Any])
      
      inline def setLineBreakUndefined: Self = StObject.set(x, "lineBreak", js.undefined)
      
      inline def setNodeComponent(value: ComponentType[js.Object]): Self = StObject.set(x, "NodeComponent", value.asInstanceOf[js.Any])
      
      inline def setNodeComponentProps(value: TextProps): Self = StObject.set(x, "nodeComponentProps", value.asInstanceOf[js.Any])
      
      inline def setNodeComponentPropsUndefined: Self = StObject.set(x, "nodeComponentProps", js.undefined)
      
      inline def setNodeComponentUndefined: Self = StObject.set(x, "NodeComponent", js.undefined)
      
      inline def setOnLinkLongPress(value: /* url */ String => Unit): Self = StObject.set(x, "onLinkLongPress", js.Any.fromFunction1(value))
      
      inline def setOnLinkLongPressUndefined: Self = StObject.set(x, "onLinkLongPress", js.undefined)
      
      inline def setOnLinkPress(value: /* url */ String => Unit): Self = StObject.set(x, "onLinkPress", js.Any.fromFunction1(value))
      
      inline def setOnLinkPressUndefined: Self = StObject.set(x, "onLinkPress", js.undefined)
      
      inline def setParagraphBreak(value: String): Self = StObject.set(x, "paragraphBreak", value.asInstanceOf[js.Any])
      
      inline def setParagraphBreakUndefined: Self = StObject.set(x, "paragraphBreak", js.undefined)
      
      inline def setRenderNode(
        value: (/* node */ HTMLViewNode, /* index */ Double, /* siblings */ js.Array[HTMLViewNode], /* parent */ HTMLViewNode, /* defaultRenderer */ HTMLViewNodeRenderer) => ReactNode
      ): Self = StObject.set(x, "renderNode", js.Any.fromFunction5(value))
      
      inline def setRenderNodeUndefined: Self = StObject.set(x, "renderNode", js.undefined)
      
      inline def setRootComponent(value: ComponentType[js.Object]): Self = StObject.set(x, "RootComponent", value.asInstanceOf[js.Any])
      
      inline def setRootComponentProps(value: ViewProps): Self = StObject.set(x, "rootComponentProps", value.asInstanceOf[js.Any])
      
      inline def setRootComponentPropsUndefined: Self = StObject.set(x, "rootComponentProps", js.undefined)
      
      inline def setRootComponentUndefined: Self = StObject.set(x, "RootComponent", js.undefined)
      
      inline def setStylesheet(value: StringDictionary[StyleProp[ViewStyle | TextStyle | ImageStyle]]): Self = StObject.set(x, "stylesheet", value.asInstanceOf[js.Any])
      
      inline def setStylesheetUndefined: Self = StObject.set(x, "stylesheet", js.undefined)
      
      inline def setTextComponent(value: ComponentType[js.Object]): Self = StObject.set(x, "TextComponent", value.asInstanceOf[js.Any])
      
      inline def setTextComponentProps(value: TextProps): Self = StObject.set(x, "textComponentProps", value.asInstanceOf[js.Any])
      
      inline def setTextComponentPropsUndefined: Self = StObject.set(x, "textComponentProps", js.undefined)
      
      inline def setTextComponentUndefined: Self = StObject.set(x, "TextComponent", js.undefined)
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  type Nullish = js.UndefOr[Null]
  
  trait SpecificAttribs extends StObject {
    
    var style: StyleProp[ViewStyle | TextStyle | ImageStyle]
  }
  object SpecificAttribs {
    
    inline def apply(): SpecificAttribs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SpecificAttribs]
    }
    
    extension [Self <: SpecificAttribs](x: Self) {
      
      inline def setStyle(value: StyleProp[ViewStyle | TextStyle | ImageStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleNull: Self = StObject.set(x, "style", null)
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
  
  type _To = ComponentType[HTMLViewProps]
  
  /* This means you don't have to write `default`, but can instead just say `mod.foo` */
  override def _to: ComponentType[HTMLViewProps] = default
}
