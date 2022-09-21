package typings.reactSketchapp

import typings.reactSketchapp.anon.Children
import typings.reactSketchapp.anon.ChildrenRequireable
import typings.reactSketchapp.anon.DefaultSource
import typings.reactSketchapp.anon.Error
import typings.reactSketchapp.anon.Flow
import typings.reactSketchapp.anon.Name
import typings.reactSketchapp.anon.PreserveAspectRatioString
import typings.reactSketchapp.anon.ResizingConstraint
import typings.reactSketchapp.anon.Shadows
import typings.reactSketchapp.anon.Style
import typings.reactSketchapp.anon.TypeofCircle
import typings.reactSketchapp.anon.TypeofClipPath
import typings.reactSketchapp.anon.TypeofDefs
import typings.reactSketchapp.anon.TypeofEllipse
import typings.reactSketchapp.anon.TypeofG
import typings.reactSketchapp.anon.TypeofImage
import typings.reactSketchapp.anon.TypeofLine
import typings.reactSketchapp.anon.TypeofLinearGradient
import typings.reactSketchapp.anon.TypeofPath
import typings.reactSketchapp.anon.TypeofPattern
import typings.reactSketchapp.anon.TypeofPolygon
import typings.reactSketchapp.anon.TypeofPolyline
import typings.reactSketchapp.anon.TypeofRadialGradient
import typings.reactSketchapp.anon.TypeofRect
import typings.reactSketchapp.anon.TypeofStop
import typings.reactSketchapp.anon.TypeofSymbol
import typings.reactSketchapp.anon.TypeofTSpan
import typings.reactSketchapp.anon.TypeofText
import typings.reactSketchapp.anon.TypeofTextPath
import typings.reactSketchapp.anon.TypeofUse
import typings.reactSketchapp.anon.UseColumns
import typings.reactSketchapp.artboardMod.Props
import typings.reactSketchapp.svgMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentsMod {
  
  @JSImport("react-sketchapp/lib/components", "Artboard")
  @js.native
  open class Artboard protected ()
    extends typings.reactSketchapp.artboardMod.Artboard {
    def this(props: Props) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: Props, context: Any) = this()
  }
  /* static members */
  object Artboard {
    
    @JSImport("react-sketchapp/lib/components", "Artboard")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-sketchapp/lib/components", "Artboard.defaultProps")
    @js.native
    def defaultProps: Name = js.native
    inline def defaultProps_=(x: Name): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("react-sketchapp/lib/components", "Artboard.propTypes")
    @js.native
    def propTypes: Children = js.native
    inline def propTypes_=(x: Children): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("react-sketchapp/lib/components", "Document")
  @js.native
  open class Document protected ()
    extends typings.reactSketchapp.documentMod.Document {
    def this(props: typings.reactSketchapp.documentMod.Props) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: typings.reactSketchapp.documentMod.Props, context: Any) = this()
  }
  /* static members */
  object Document {
    
    @JSImport("react-sketchapp/lib/components", "Document")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-sketchapp/lib/components", "Document.propTypes")
    @js.native
    def propTypes: ChildrenRequireable = js.native
    inline def propTypes_=(x: ChildrenRequireable): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("react-sketchapp/lib/components", "Image")
  @js.native
  open class Image protected ()
    extends typings.reactSketchapp.imageMod.Image {
    def this(props: typings.reactSketchapp.imageMod.Props) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: typings.reactSketchapp.imageMod.Props, context: Any) = this()
  }
  /* static members */
  object Image {
    
    @JSImport("react-sketchapp/lib/components", "Image")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-sketchapp/lib/components", "Image.defaultProps")
    @js.native
    def defaultProps: Name = js.native
    inline def defaultProps_=(x: Name): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("react-sketchapp/lib/components", "Image.propTypes")
    @js.native
    def propTypes: DefaultSource = js.native
    inline def propTypes_=(x: DefaultSource): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("react-sketchapp/lib/components", "Page")
  @js.native
  open class Page protected ()
    extends typings.reactSketchapp.pageMod.Page {
    def this(props: typings.reactSketchapp.pageMod.Props) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: typings.reactSketchapp.pageMod.Props, context: Any) = this()
  }
  /* static members */
  object Page {
    
    @JSImport("react-sketchapp/lib/components", "Page")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-sketchapp/lib/components", "Page.propTypes")
    @js.native
    def propTypes: Style = js.native
    inline def propTypes_=(x: Style): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("react-sketchapp/lib/components", "RedBox")
  @js.native
  open class RedBox protected ()
    extends typings.reactSketchapp.redBoxMod.RedBox {
    def this(props: typings.reactSketchapp.redBoxMod.Props) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: typings.reactSketchapp.redBoxMod.Props, context: Any) = this()
  }
  /* static members */
  object RedBox {
    
    @JSImport("react-sketchapp/lib/components", "RedBox")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-sketchapp/lib/components", "RedBox.defaultProps")
    @js.native
    def defaultProps: UseColumns = js.native
    inline def defaultProps_=(x: UseColumns): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("react-sketchapp/lib/components", "RedBox.propTypes")
    @js.native
    def propTypes: Error = js.native
    inline def propTypes_=(x: Error): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("react-sketchapp/lib/components", "Svg")
  @js.native
  open class Svg protected () extends default {
    def this(props: typings.reactSketchapp.svgSvgMod.Props) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: typings.reactSketchapp.svgSvgMod.Props, context: Any) = this()
  }
  /* static members */
  object Svg {
    
    @JSImport("react-sketchapp/lib/components", "Svg")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-sketchapp/lib/components", "Svg.Circle")
    @js.native
    def Circle: TypeofCircle = js.native
    inline def Circle_=(x: TypeofCircle): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Circle")(x.asInstanceOf[js.Any])
    
    @JSImport("react-sketchapp/lib/components", "Svg.ClipPath")
    @js.native
    def ClipPath: TypeofClipPath = js.native
    inline def ClipPath_=(x: TypeofClipPath): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ClipPath")(x.asInstanceOf[js.Any])
    
    @JSImport("react-sketchapp/lib/components", "Svg.Defs")
    @js.native
    def Defs: TypeofDefs = js.native
    inline def Defs_=(x: TypeofDefs): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Defs")(x.asInstanceOf[js.Any])
    
    @JSImport("react-sketchapp/lib/components", "Svg.Ellipse")
    @js.native
    def Ellipse: TypeofEllipse = js.native
    inline def Ellipse_=(x: TypeofEllipse): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Ellipse")(x.asInstanceOf[js.Any])
    
    @JSImport("react-sketchapp/lib/components", "Svg.G")
    @js.native
    def G: TypeofG = js.native
    inline def G_=(x: TypeofG): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("G")(x.asInstanceOf[js.Any])
    
    @JSImport("react-sketchapp/lib/components", "Svg.Image")
    @js.native
    def Image: TypeofImage = js.native
    inline def Image_=(x: TypeofImage): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Image")(x.asInstanceOf[js.Any])
    
    @JSImport("react-sketchapp/lib/components", "Svg.Line")
    @js.native
    def Line: TypeofLine = js.native
    inline def Line_=(x: TypeofLine): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Line")(x.asInstanceOf[js.Any])
    
    @JSImport("react-sketchapp/lib/components", "Svg.LinearGradient")
    @js.native
    def LinearGradient: TypeofLinearGradient = js.native
    inline def LinearGradient_=(x: TypeofLinearGradient): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LinearGradient")(x.asInstanceOf[js.Any])
    
    @JSImport("react-sketchapp/lib/components", "Svg.Path")
    @js.native
    def Path: TypeofPath = js.native
    inline def Path_=(x: TypeofPath): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Path")(x.asInstanceOf[js.Any])
    
    @JSImport("react-sketchapp/lib/components", "Svg.Pattern")
    @js.native
    def Pattern: TypeofPattern = js.native
    inline def Pattern_=(x: TypeofPattern): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Pattern")(x.asInstanceOf[js.Any])
    
    @JSImport("react-sketchapp/lib/components", "Svg.Polygon")
    @js.native
    def Polygon: TypeofPolygon = js.native
    inline def Polygon_=(x: TypeofPolygon): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Polygon")(x.asInstanceOf[js.Any])
    
    @JSImport("react-sketchapp/lib/components", "Svg.Polyline")
    @js.native
    def Polyline: TypeofPolyline = js.native
    inline def Polyline_=(x: TypeofPolyline): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Polyline")(x.asInstanceOf[js.Any])
    
    @JSImport("react-sketchapp/lib/components", "Svg.RadialGradient")
    @js.native
    def RadialGradient: TypeofRadialGradient = js.native
    inline def RadialGradient_=(x: TypeofRadialGradient): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("RadialGradient")(x.asInstanceOf[js.Any])
    
    @JSImport("react-sketchapp/lib/components", "Svg.Rect")
    @js.native
    def Rect: TypeofRect = js.native
    inline def Rect_=(x: TypeofRect): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Rect")(x.asInstanceOf[js.Any])
    
    @JSImport("react-sketchapp/lib/components", "Svg.Stop")
    @js.native
    def Stop: TypeofStop = js.native
    inline def Stop_=(x: TypeofStop): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Stop")(x.asInstanceOf[js.Any])
    
    @JSImport("react-sketchapp/lib/components", "Svg.Symbol")
    @js.native
    val Symbol: TypeofSymbol = js.native
    
    @JSImport("react-sketchapp/lib/components", "Svg.TSpan")
    @js.native
    def TSpan: TypeofTSpan = js.native
    inline def TSpan_=(x: TypeofTSpan): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TSpan")(x.asInstanceOf[js.Any])
    
    @JSImport("react-sketchapp/lib/components", "Svg.Text")
    @js.native
    def Text: TypeofText = js.native
    
    @JSImport("react-sketchapp/lib/components", "Svg.TextPath")
    @js.native
    def TextPath: TypeofTextPath = js.native
    inline def TextPath_=(x: TypeofTextPath): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TextPath")(x.asInstanceOf[js.Any])
    
    inline def Text_=(x: TypeofText): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Text")(x.asInstanceOf[js.Any])
    
    @JSImport("react-sketchapp/lib/components", "Svg.Use")
    @js.native
    def Use: TypeofUse = js.native
    inline def Use_=(x: TypeofUse): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Use")(x.asInstanceOf[js.Any])
    
    @JSImport("react-sketchapp/lib/components", "Svg.defaultProps")
    @js.native
    def defaultProps: PreserveAspectRatioString = js.native
    inline def defaultProps_=(x: PreserveAspectRatioString): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("react-sketchapp/lib/components", "Svg.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
    
    @JSImport("react-sketchapp/lib/components", "Svg.propTypes")
    @js.native
    def propTypes: Flow = js.native
    inline def propTypes_=(x: Flow): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("react-sketchapp/lib/components", "Text")
  @js.native
  open class Text protected ()
    extends typings.reactSketchapp.componentsTextMod.Text {
    def this(props: typings.reactSketchapp.componentsTextMod.Props) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: typings.reactSketchapp.componentsTextMod.Props, context: Any) = this()
  }
  /* static members */
  object Text {
    
    @JSImport("react-sketchapp/lib/components", "Text")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-sketchapp/lib/components", "Text.propTypes")
    @js.native
    def propTypes: ResizingConstraint = js.native
    inline def propTypes_=(x: ResizingConstraint): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("react-sketchapp/lib/components", "View")
  @js.native
  open class View protected ()
    extends typings.reactSketchapp.viewMod.View {
    def this(props: typings.reactSketchapp.viewMod.Props) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: typings.reactSketchapp.viewMod.Props, context: Any) = this()
  }
  /* static members */
  object View {
    
    @JSImport("react-sketchapp/lib/components", "View")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-sketchapp/lib/components", "View.defaultProps")
    @js.native
    def defaultProps: Name = js.native
    inline def defaultProps_=(x: Name): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("react-sketchapp/lib/components", "View.propTypes")
    @js.native
    def propTypes: Shadows = js.native
    inline def propTypes_=(x: Shadows): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
  }
}
