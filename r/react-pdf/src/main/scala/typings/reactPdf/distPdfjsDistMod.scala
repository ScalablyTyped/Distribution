package typings.reactPdf

import typings.pdfjsDist.anon.Element
import typings.pdfjsDist.anon.Name
import typings.pdfjsDist.anon.Rotation
import typings.pdfjsDist.anon.TextDivs
import typings.pdfjsDist.typesSrcDisplayAnnotationLayerMod.AnnotationLayerParameters
import typings.pdfjsDist.typesSrcDisplayAnnotationLayerMod.PageViewport
import typings.pdfjsDist.typesSrcDisplayApiMod.GetDocumentParameters
import typings.pdfjsDist.typesSrcDisplayApiMod.PDFDocumentLoadingTask
import typings.pdfjsDist.typesSrcDisplayApiMod.PDFWorkerParameters
import typings.pdfjsDist.typesSrcDisplayEditorAnnotationEditorLayerMod.AnnotationEditorLayerOptions
import typings.pdfjsDist.typesSrcDisplayEditorToolsMod.KeyboardManager
import typings.pdfjsDist.typesSrcDisplayTextLayerMod.TextLayerRenderParameters
import typings.pdfjsDist.typesSrcDisplayTextLayerMod.TextLayerRenderTask
import typings.pdfjsDist.typesSrcDisplayWorkerOptionsMod.GlobalWorkerOptionsType
import typings.pdfjsDist.typesSrcDisplayXfaLayerMod.XfaLayerParameters
import typings.pdfjsDist.typesSrcSharedUtilMod.PromiseCapability
import typings.std.HTMLDivElement
import typings.std.URL
import typings.std.WeakMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distPdfjsDistMod {
  
  object default {
    
    @JSImport("react-pdf/dist/pdfjs-dist", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-pdf/dist/pdfjs-dist", "default.AnnotationEditorLayer")
    @js.native
    open class AnnotationEditorLayer protected ()
      extends typings.pdfjsDist.mod.AnnotationEditorLayer {
      /**
        * @param {AnnotationEditorLayerOptions} options
        */
      def this(options: AnnotationEditorLayerOptions) = this()
    }
    /* static members */
    object AnnotationEditorLayer {
      
      @JSImport("react-pdf/dist/pdfjs-dist", "default.AnnotationEditorLayer")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("react-pdf/dist/pdfjs-dist", "default.AnnotationEditorLayer._initialized")
      @js.native
      def _initialized: Boolean = js.native
      inline def _initialized_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_initialized")(x.asInstanceOf[js.Any])
    }
    
    object AnnotationEditorParamsType {
      
      @JSImport("react-pdf/dist/pdfjs-dist", "default.AnnotationEditorParamsType.FREETEXT_COLOR")
      @js.native
      val FREETEXT_COLOR: Double = js.native
      
      @JSImport("react-pdf/dist/pdfjs-dist", "default.AnnotationEditorParamsType.FREETEXT_OPACITY")
      @js.native
      val FREETEXT_OPACITY: Double = js.native
      
      @JSImport("react-pdf/dist/pdfjs-dist", "default.AnnotationEditorParamsType.FREETEXT_SIZE")
      @js.native
      val FREETEXT_SIZE: Double = js.native
      
      @JSImport("react-pdf/dist/pdfjs-dist", "default.AnnotationEditorParamsType.INK_COLOR")
      @js.native
      val INK_COLOR: Double = js.native
      
      @JSImport("react-pdf/dist/pdfjs-dist", "default.AnnotationEditorParamsType.INK_OPACITY")
      @js.native
      val INK_OPACITY: Double = js.native
      
      @JSImport("react-pdf/dist/pdfjs-dist", "default.AnnotationEditorParamsType.INK_THICKNESS")
      @js.native
      val INK_THICKNESS: Double = js.native
    }
    
    object AnnotationEditorType {
      
      @JSImport("react-pdf/dist/pdfjs-dist", "default.AnnotationEditorType.DISABLE")
      @js.native
      val DISABLE: Double = js.native
      
      @JSImport("react-pdf/dist/pdfjs-dist", "default.AnnotationEditorType.FREETEXT")
      @js.native
      val FREETEXT: Double = js.native
      
      @JSImport("react-pdf/dist/pdfjs-dist", "default.AnnotationEditorType.INK")
      @js.native
      val INK: Double = js.native
      
      @JSImport("react-pdf/dist/pdfjs-dist", "default.AnnotationEditorType.NONE")
      @js.native
      val NONE: Double = js.native
    }
    
    @JSImport("react-pdf/dist/pdfjs-dist", "default.AnnotationEditorUIManager")
    @js.native
    open class AnnotationEditorUIManager protected ()
      extends typings.pdfjsDist.mod.AnnotationEditorUIManager {
      def this(container: Any, eventBus: Any) = this()
    }
    /* static members */
    object AnnotationEditorUIManager {
      
      @JSImport("react-pdf/dist/pdfjs-dist", "default.AnnotationEditorUIManager")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("react-pdf/dist/pdfjs-dist", "default.AnnotationEditorUIManager._keyboardManager")
      @js.native
      def _keyboardManager: KeyboardManager = js.native
      inline def _keyboardManager_=(x: KeyboardManager): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_keyboardManager")(x.asInstanceOf[js.Any])
    }
    
    @JSImport("react-pdf/dist/pdfjs-dist", "default.AnnotationLayer")
    @js.native
    open class AnnotationLayer ()
      extends typings.pdfjsDist.mod.AnnotationLayer
    /* static members */
    object AnnotationLayer {
      
      @JSImport("react-pdf/dist/pdfjs-dist", "default.AnnotationLayer")
      @js.native
      val ^ : js.Any = js.native
      
      inline def `__Numbersign26@NumbersignappendElement`(element: Any, id: Any, div: Any, accessibilityManager: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("__#26@#appendElement")(element.asInstanceOf[js.Any], id.asInstanceOf[js.Any], div.asInstanceOf[js.Any], accessibilityManager.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      inline def `__Numbersign26@NumbersignsetAnnotationCanvasMap`(div: Any, annotationCanvasMap: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("__#26@#setAnnotationCanvasMap")(div.asInstanceOf[js.Any], annotationCanvasMap.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      /**
        * @param {HTMLDivElement} div
        * @param {PageViewport} viewport
        */
      inline def `__Numbersign26@NumbersignsetDimensions`(div: HTMLDivElement, param1: PageViewport): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("__#26@#setDimensions")(div.asInstanceOf[js.Any], param1.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      /**
        * Render a new annotation layer with all annotation elements.
        *
        * @public
        * @param {AnnotationLayerParameters} parameters
        * @memberof AnnotationLayer
        */
      inline def render(parameters: AnnotationLayerParameters): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("render")(parameters.asInstanceOf[js.Any]).asInstanceOf[Unit]
      
      /**
        * Update the annotation elements on existing annotation layer.
        *
        * @public
        * @param {AnnotationLayerParameters} parameters
        * @memberof AnnotationLayer
        */
      inline def update(parameters: AnnotationLayerParameters): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("update")(parameters.asInstanceOf[js.Any]).asInstanceOf[Unit]
    }
    
    object AnnotationMode {
      
      @JSImport("react-pdf/dist/pdfjs-dist", "default.AnnotationMode.DISABLE_1")
      @js.native
      val DISABLE_1: Double = js.native
      
      @JSImport("react-pdf/dist/pdfjs-dist", "default.AnnotationMode.ENABLE")
      @js.native
      val ENABLE: Double = js.native
      
      @JSImport("react-pdf/dist/pdfjs-dist", "default.AnnotationMode.ENABLE_FORMS")
      @js.native
      val ENABLE_FORMS: Double = js.native
      
      @JSImport("react-pdf/dist/pdfjs-dist", "default.AnnotationMode.ENABLE_STORAGE")
      @js.native
      val ENABLE_STORAGE: Double = js.native
    }
    
    object CMapCompressionType {
      
      @JSImport("react-pdf/dist/pdfjs-dist", "default.CMapCompressionType.BINARY")
      @js.native
      val BINARY: Double = js.native
      
      @JSImport("react-pdf/dist/pdfjs-dist", "default.CMapCompressionType.NONE_2")
      @js.native
      val NONE_2: Double = js.native
      
      @JSImport("react-pdf/dist/pdfjs-dist", "default.CMapCompressionType.STREAM")
      @js.native
      val STREAM: Double = js.native
    }
    
    @JSImport("react-pdf/dist/pdfjs-dist", "default.GlobalWorkerOptions")
    @js.native
    val GlobalWorkerOptions: GlobalWorkerOptionsType = js.native
    
    @JSImport("react-pdf/dist/pdfjs-dist", "default.InvalidPDFException")
    @js.native
    open class InvalidPDFException protected ()
      extends typings.pdfjsDist.mod.InvalidPDFException {
      def this(msg: Any) = this()
    }
    
    @JSImport("react-pdf/dist/pdfjs-dist", "default.LoopbackPort")
    @js.native
    open class LoopbackPort ()
      extends typings.pdfjsDist.mod.LoopbackPort
    
    @JSImport("react-pdf/dist/pdfjs-dist", "default.MissingPDFException")
    @js.native
    open class MissingPDFException protected ()
      extends typings.pdfjsDist.mod.MissingPDFException {
      def this(msg: Any) = this()
    }
    
    object OPS {
      
      @JSImport("react-pdf/dist/pdfjs-dist", "default.OPS.beginAnnotation")
      @js.native
      val beginAnnotation: Double = js.native
      
      @JSImport("react-pdf/dist/pdfjs-dist", "default.OPS.beginAnnotations")
      @js.native
      val beginAnnotations: Double = js.native
      
      @JSImport("react-pdf/dist/pdfjs-dist", "default.OPS.beginCompat")
      @js.native
      val beginCompat: Double = js.native
      
      @JSImport("react-pdf/dist/pdfjs-dist", "default.OPS.beginGroup")
      @js.native
      val beginGroup: Double = js.native
      
      @JSImport("react-pdf/dist/pdfjs-dist", "default.OPS.beginImageData")
      @js.native
      val beginImageData: Double = js.native
      
      @JSImport("react-pdf/dist/pdfjs-dist", "default.OPS.beginInlineImage")
      @js.native
      val beginInlineImage: Double = js.native
      
      @JSImport("react-pdf/dist/pdfjs-dist", "default.OPS.beginMarkedContent")
      @js.native
      val beginMarkedContent: Double = js.native
      
      @JSImport("react-pdf/dist/pdfjs-dist", "default.OPS.beginMarkedContentProps")
      @js.native
      val beginMarkedContentProps: Double = js.native
      
      @JSImport("react-pdf/dist/pdfjs-dist", "default.OPS.beginText")
      @js.native
      val beginText: Double = js.native
      
      @JSImport("react-pdf/dist/pdfjs-dist", "default.OPS.clip")
      @js.native
      val clip: Double = js.native
      
      @JSImport("react-pdf/dist/pdfjs-dist", "default.OPS.closeEOFillStroke")
      @js.native
      val closeEOFillStroke: Double = js.native
      
      @JSImport("react-pdf/dist/pdfjs-dist", "default.OPS.closeFillStroke")
      @js.native
      val closeFillStroke: Double = js.native
      
      @JSImport("react-pdf/dist/pdfjs-dist", "default.OPS.closePath")
      @js.native
      val closePath: Double = js.native
      
      @JSImport("react-pdf/dist/pdfjs-dist", "default.OPS.closeStroke")
      @js.native
      val closeStroke: Double = js.native
      
      @JSImport("react-pdf/dist/pdfjs-dist", "default.OPS.constructPath")
      @js.native
      val constructPath: Double = js.native
      
      @JSImport("react-pdf/dist/pdfjs-dist", "default.OPS.curveTo")
      @js.native
      val curveTo: Double = js.native
      
      @JSImport("react-pdf/dist/pdfjs-dist", "default.OPS.curveTo2")
      @js.native
      val curveTo2: Double = js.native
      
      @JSImport("react-pdf/dist/pdfjs-dist", "default.OPS.curveTo3")
      @js.native
      val curveTo3: Double = js.native
      
      @JSImport("react-pdf/dist/pdfjs-dist", "default.OPS.dependency")
      @js.native
      val dependency: Double = js.native
      
      @JSImport("react-pdf/dist/pdfjs-dist", "default.OPS.endAnnotation")
      @js.native
      val endAnnotation: Double = js.native
      
      @JSImport("react-pdf/dist/pdfjs-dist", "default.OPS.endAnnotations")
      @js.native
      val endAnnotations: Double = js.native
      
      @JSImport("react-pdf/dist/pdfjs-dist", "default.OPS.endCompat")
      @js.native
      val endCompat: Double = js.native
      
      @JSImport("react-pdf/dist/pdfjs-dist", "default.OPS.endGroup")
      @js.native
      val endGroup: Double = js.native
      
      @JSImport("react-pdf/dist/pdfjs-dist", "default.OPS.endInlineImage")
      @js.native
      val endInlineImage: Double = js.native
      
      @JSImport("react-pdf/dist/pdfjs-dist", "default.OPS.endMarkedContent")
      @js.native
      val endMarkedContent: Double = js.native
      
      @JSImport("react-pdf/dist/pdfjs-dist", "default.OPS.endPath")
      @js.native
      val endPath: Double = js.native
      
      @JSImport("react-pdf/dist/pdfjs-dist", "default.OPS.endText")
      @js.native
      val endText: Double = js.native
      
      @JSImport("react-pdf/dist/pdfjs-dist", "default.OPS.eoClip")
      @js.native
      val eoClip: Double = js.native
      
      @JSImport("react-pdf/dist/pdfjs-dist", "default.OPS.eoFill")
      @js.native
      val eoFill: Double = js.native
      
      @JSImport("react-pdf/dist/pdfjs-dist", "default.OPS.eoFillStroke")
      @js.native
      val eoFillStroke: Double = js.native
      
      @JSImport("react-pdf/dist/pdfjs-dist", "default.OPS.fill")
      @js.native
      val fill: Double = js.native
      
      @JSImport("react-pdf/dist/pdfjs-dist", "default.OPS.fillStroke")
      @js.native
      val fillStroke: Double = js.native
      
      @JSImport("react-pdf/dist/pdfjs-dist", "default.OPS.lineTo")
      @js.native
      val lineTo: Double = js.native
      
      @JSImport("react-pdf/dist/pdfjs-dist", "default.OPS.markPoint")
      @js.native
      val markPoint: Double = js.native
      
      @JSImport("react-pdf/dist/pdfjs-dist", "default.OPS.markPointProps")
      @js.native
      val markPointProps: Double = js.native
      
      @JSImport("react-pdf/dist/pdfjs-dist", "default.OPS.moveText")
      @js.native
      val moveText: Double = js.native
      
      @JSImport("react-pdf/dist/pdfjs-dist", "default.OPS.moveTo")
      @js.native
      val moveTo: Double = js.native
      
      @JSImport("react-pdf/dist/pdfjs-dist", "default.OPS.nextLine")
      @js.native
      val nextLine: Double = js.native
      
      @JSImport("react-pdf/dist/pdfjs-dist", "default.OPS.nextLineSetSpacingShowText")
      @js.native
      val nextLineSetSpacingShowText: Double = js.native
      
      @JSImport("react-pdf/dist/pdfjs-dist", "default.OPS.nextLineShowText")
      @js.native
      val nextLineShowText: Double = js.native
      
      @JSImport("react-pdf/dist/pdfjs-dist", "default.OPS.paintFormXObjectBegin")
      @js.native
      val paintFormXObjectBegin: Double = js.native
      
      @JSImport("react-pdf/dist/pdfjs-dist", "default.OPS.paintFormXObjectEnd")
      @js.native
      val paintFormXObjectEnd: Double = js.native
      
      @JSImport("react-pdf/dist/pdfjs-dist", "default.OPS.paintImageMaskXObject")
      @js.native
      val paintImageMaskXObject: Double = js.native
      
      @JSImport("react-pdf/dist/pdfjs-dist", "default.OPS.paintImageMaskXObjectGroup")
      @js.native
      val paintImageMaskXObjectGroup: Double = js.native
      
      @JSImport("react-pdf/dist/pdfjs-dist", "default.OPS.paintImageMaskXObjectRepeat")
      @js.native
      val paintImageMaskXObjectRepeat: Double = js.native
      
      @JSImport("react-pdf/dist/pdfjs-dist", "default.OPS.paintImageXObject")
      @js.native
      val paintImageXObject: Double = js.native
      
      @JSImport("react-pdf/dist/pdfjs-dist", "default.OPS.paintImageXObjectRepeat")
      @js.native
      val paintImageXObjectRepeat: Double = js.native
      
      @JSImport("react-pdf/dist/pdfjs-dist", "default.OPS.paintInlineImageXObject")
      @js.native
      val paintInlineImageXObject: Double = js.native
      
      @JSImport("react-pdf/dist/pdfjs-dist", "default.OPS.paintInlineImageXObjectGroup")
      @js.native
      val paintInlineImageXObjectGroup: Double = js.native
      
      @JSImport("react-pdf/dist/pdfjs-dist", "default.OPS.paintJpegXObject")
      @js.native
      val paintJpegXObject: Double = js.native
      
      @JSImport("react-pdf/dist/pdfjs-dist", "default.OPS.paintSolidColorImageMask")
      @js.native
      val paintSolidColorImageMask: Double = js.native
      
      @JSImport("react-pdf/dist/pdfjs-dist", "default.OPS.paintXObject")
      @js.native
      val paintXObject: Double = js.native
      
      @JSImport("react-pdf/dist/pdfjs-dist", "default.OPS.rectangle")
      @js.native
      val rectangle: Double = js.native
      
      @JSImport("react-pdf/dist/pdfjs-dist", "default.OPS.restore")
      @js.native
      val restore: Double = js.native
      
      @JSImport("react-pdf/dist/pdfjs-dist", "default.OPS.save")
      @js.native
      val save: Double = js.native
      
      @JSImport("react-pdf/dist/pdfjs-dist", "default.OPS.setCharSpacing")
      @js.native
      val setCharSpacing: Double = js.native
      
      @JSImport("react-pdf/dist/pdfjs-dist", "default.OPS.setCharWidth")
      @js.native
      val setCharWidth: Double = js.native
      
      @JSImport("react-pdf/dist/pdfjs-dist", "default.OPS.setCharWidthAndBounds")
      @js.native
      val setCharWidthAndBounds: Double = js.native
      
      @JSImport("react-pdf/dist/pdfjs-dist", "default.OPS.setDash")
      @js.native
      val setDash: Double = js.native
      
      @JSImport("react-pdf/dist/pdfjs-dist", "default.OPS.setFillCMYKColor")
      @js.native
      val setFillCMYKColor: Double = js.native
      
      @JSImport("react-pdf/dist/pdfjs-dist", "default.OPS.setFillColor")
      @js.native
      val setFillColor: Double = js.native
      
      @JSImport("react-pdf/dist/pdfjs-dist", "default.OPS.setFillColorN")
      @js.native
      val setFillColorN: Double = js.native
      
      @JSImport("react-pdf/dist/pdfjs-dist", "default.OPS.setFillColorSpace")
      @js.native
      val setFillColorSpace: Double = js.native
      
      @JSImport("react-pdf/dist/pdfjs-dist", "default.OPS.setFillGray")
      @js.native
      val setFillGray: Double = js.native
      
      @JSImport("react-pdf/dist/pdfjs-dist", "default.OPS.setFillRGBColor")
      @js.native
      val setFillRGBColor: Double = js.native
      
      @JSImport("react-pdf/dist/pdfjs-dist", "default.OPS.setFlatness")
      @js.native
      val setFlatness: Double = js.native
      
      @JSImport("react-pdf/dist/pdfjs-dist", "default.OPS.setFont")
      @js.native
      val setFont: Double = js.native
      
      @JSImport("react-pdf/dist/pdfjs-dist", "default.OPS.setGState")
      @js.native
      val setGState: Double = js.native
      
      @JSImport("react-pdf/dist/pdfjs-dist", "default.OPS.setHScale")
      @js.native
      val setHScale: Double = js.native
      
      @JSImport("react-pdf/dist/pdfjs-dist", "default.OPS.setLeading")
      @js.native
      val setLeading: Double = js.native
      
      @JSImport("react-pdf/dist/pdfjs-dist", "default.OPS.setLeadingMoveText")
      @js.native
      val setLeadingMoveText: Double = js.native
      
      @JSImport("react-pdf/dist/pdfjs-dist", "default.OPS.setLineCap")
      @js.native
      val setLineCap: Double = js.native
      
      @JSImport("react-pdf/dist/pdfjs-dist", "default.OPS.setLineJoin")
      @js.native
      val setLineJoin: Double = js.native
      
      @JSImport("react-pdf/dist/pdfjs-dist", "default.OPS.setLineWidth")
      @js.native
      val setLineWidth: Double = js.native
      
      @JSImport("react-pdf/dist/pdfjs-dist", "default.OPS.setMiterLimit")
      @js.native
      val setMiterLimit: Double = js.native
      
      @JSImport("react-pdf/dist/pdfjs-dist", "default.OPS.setRenderingIntent")
      @js.native
      val setRenderingIntent: Double = js.native
      
      @JSImport("react-pdf/dist/pdfjs-dist", "default.OPS.setStrokeCMYKColor")
      @js.native
      val setStrokeCMYKColor: Double = js.native
      
      @JSImport("react-pdf/dist/pdfjs-dist", "default.OPS.setStrokeColor")
      @js.native
      val setStrokeColor: Double = js.native
      
      @JSImport("react-pdf/dist/pdfjs-dist", "default.OPS.setStrokeColorN")
      @js.native
      val setStrokeColorN: Double = js.native
      
      @JSImport("react-pdf/dist/pdfjs-dist", "default.OPS.setStrokeColorSpace")
      @js.native
      val setStrokeColorSpace: Double = js.native
      
      @JSImport("react-pdf/dist/pdfjs-dist", "default.OPS.setStrokeGray")
      @js.native
      val setStrokeGray: Double = js.native
      
      @JSImport("react-pdf/dist/pdfjs-dist", "default.OPS.setStrokeRGBColor")
      @js.native
      val setStrokeRGBColor: Double = js.native
      
      @JSImport("react-pdf/dist/pdfjs-dist", "default.OPS.setTextMatrix")
      @js.native
      val setTextMatrix: Double = js.native
      
      @JSImport("react-pdf/dist/pdfjs-dist", "default.OPS.setTextRenderingMode")
      @js.native
      val setTextRenderingMode: Double = js.native
      
      @JSImport("react-pdf/dist/pdfjs-dist", "default.OPS.setTextRise")
      @js.native
      val setTextRise: Double = js.native
      
      @JSImport("react-pdf/dist/pdfjs-dist", "default.OPS.setWordSpacing")
      @js.native
      val setWordSpacing: Double = js.native
      
      @JSImport("react-pdf/dist/pdfjs-dist", "default.OPS.shadingFill")
      @js.native
      val shadingFill: Double = js.native
      
      @JSImport("react-pdf/dist/pdfjs-dist", "default.OPS.showSpacedText")
      @js.native
      val showSpacedText: Double = js.native
      
      @JSImport("react-pdf/dist/pdfjs-dist", "default.OPS.showText")
      @js.native
      val showText: Double = js.native
      
      @JSImport("react-pdf/dist/pdfjs-dist", "default.OPS.stroke")
      @js.native
      val stroke: Double = js.native
      
      @JSImport("react-pdf/dist/pdfjs-dist", "default.OPS.transform")
      @js.native
      val transform: Double = js.native
    }
    
    @JSImport("react-pdf/dist/pdfjs-dist", "default.PDFDataRangeTransport")
    @js.native
    open class PDFDataRangeTransport protected ()
      extends typings.pdfjsDist.mod.PDFDataRangeTransport {
      /**
        * @param {number} length
        * @param {Uint8Array} initialData
        * @param {boolean} [progressiveDone]
        * @param {string} [contentDispositionFilename]
        */
      def this(length: Double, initialData: js.typedarray.Uint8Array) = this()
      def this(length: Double, initialData: js.typedarray.Uint8Array, progressiveDone: Boolean) = this()
      def this(
        length: Double,
        initialData: js.typedarray.Uint8Array,
        progressiveDone: Boolean,
        contentDispositionFilename: String
      ) = this()
      def this(
        length: Double,
        initialData: js.typedarray.Uint8Array,
        progressiveDone: Unit,
        contentDispositionFilename: String
      ) = this()
    }
    
    @JSImport("react-pdf/dist/pdfjs-dist", "default.PDFDateString")
    @js.native
    open class PDFDateString ()
      extends typings.pdfjsDist.mod.PDFDateString
    /* static members */
    object PDFDateString {
      
      @JSImport("react-pdf/dist/pdfjs-dist", "default.PDFDateString")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Convert a PDF date string to a JavaScript `Date` object.
        *
        * The PDF date string format is described in section 7.9.4 of the official
        * PDF 32000-1:2008 specification. However, in the PDF 1.7 reference (sixth
        * edition) Adobe describes the same format including a trailing apostrophe.
        * This syntax in incorrect, but Adobe Acrobat creates PDF files that contain
        * them. We ignore all apostrophes as they are not necessary for date parsing.
        *
        * Moreover, Adobe Acrobat doesn't handle changing the date to universal time
        * and doesn't use the user's time zone (effectively ignoring the HH' and mm'
        * parts of the date string).
        *
        * @param {string} input
        * @returns {Date|null}
        */
      inline def toDateObject(input: String): js.Date | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("toDateObject")(input.asInstanceOf[js.Any]).asInstanceOf[js.Date | Null]
    }
    
    @JSImport("react-pdf/dist/pdfjs-dist", "default.PDFWorker")
    @js.native
    open class PDFWorker ()
      extends typings.pdfjsDist.mod.PDFWorker {
      def this(param0: Name) = this()
    }
    /* static members */
    object PDFWorker {
      
      @JSImport("react-pdf/dist/pdfjs-dist", "default.PDFWorker")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("react-pdf/dist/pdfjs-dist", "default.PDFWorker.__#17@#workerPorts")
      @js.native
      val `__Numbersign17@NumbersignworkerPorts`: WeakMap[js.Object, Any] = js.native
      
      /**
        * @param {PDFWorkerParameters} params - The worker initialization parameters.
        */
      inline def fromPort(params: PDFWorkerParameters): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("fromPort")(params.asInstanceOf[js.Any]).asInstanceOf[Any]
    }
    
    object PasswordResponses {
      
      @JSImport("react-pdf/dist/pdfjs-dist", "default.PasswordResponses.INCORRECT_PASSWORD")
      @js.native
      val INCORRECT_PASSWORD: Double = js.native
      
      @JSImport("react-pdf/dist/pdfjs-dist", "default.PasswordResponses.NEED_PASSWORD")
      @js.native
      val NEED_PASSWORD: Double = js.native
    }
    
    object PermissionFlag {
      
      @JSImport("react-pdf/dist/pdfjs-dist", "default.PermissionFlag.ASSEMBLE")
      @js.native
      val ASSEMBLE: Double = js.native
      
      @JSImport("react-pdf/dist/pdfjs-dist", "default.PermissionFlag.COPY")
      @js.native
      val COPY: Double = js.native
      
      @JSImport("react-pdf/dist/pdfjs-dist", "default.PermissionFlag.COPY_FOR_ACCESSIBILITY")
      @js.native
      val COPY_FOR_ACCESSIBILITY: Double = js.native
      
      @JSImport("react-pdf/dist/pdfjs-dist", "default.PermissionFlag.FILL_INTERACTIVE_FORMS")
      @js.native
      val FILL_INTERACTIVE_FORMS: Double = js.native
      
      @JSImport("react-pdf/dist/pdfjs-dist", "default.PermissionFlag.MODIFY_ANNOTATIONS")
      @js.native
      val MODIFY_ANNOTATIONS: Double = js.native
      
      @JSImport("react-pdf/dist/pdfjs-dist", "default.PermissionFlag.MODIFY_CONTENTS")
      @js.native
      val MODIFY_CONTENTS: Double = js.native
      
      @JSImport("react-pdf/dist/pdfjs-dist", "default.PermissionFlag.PRINT_1")
      @js.native
      val PRINT_1: Double = js.native
      
      @JSImport("react-pdf/dist/pdfjs-dist", "default.PermissionFlag.PRINT_HIGH_QUALITY")
      @js.native
      val PRINT_HIGH_QUALITY: Double = js.native
    }
    
    @JSImport("react-pdf/dist/pdfjs-dist", "default.PixelsPerInch")
    @js.native
    open class PixelsPerInch ()
      extends typings.pdfjsDist.mod.PixelsPerInch
    /* static members */
    object PixelsPerInch {
      
      @JSImport("react-pdf/dist/pdfjs-dist", "default.PixelsPerInch")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("react-pdf/dist/pdfjs-dist", "default.PixelsPerInch.CSS")
      @js.native
      def CSS: Double = js.native
      inline def CSS_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CSS")(x.asInstanceOf[js.Any])
      
      @JSImport("react-pdf/dist/pdfjs-dist", "default.PixelsPerInch.PDF")
      @js.native
      def PDF: Double = js.native
      inline def PDF_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PDF")(x.asInstanceOf[js.Any])
      
      @JSImport("react-pdf/dist/pdfjs-dist", "default.PixelsPerInch.PDF_TO_CSS_UNITS")
      @js.native
      def PDF_TO_CSS_UNITS: Double = js.native
      inline def PDF_TO_CSS_UNITS_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PDF_TO_CSS_UNITS")(x.asInstanceOf[js.Any])
    }
    
    @JSImport("react-pdf/dist/pdfjs-dist", "default.RenderingCancelledException")
    @js.native
    open class RenderingCancelledException protected ()
      extends typings.pdfjsDist.mod.RenderingCancelledException {
      def this(msg: Any, `type`: Any) = this()
    }
    
    @JSImport("react-pdf/dist/pdfjs-dist", "default.SVGGraphics")
    @js.native
    def SVGGraphics: Any = js.native
    inline def SVGGraphics_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SVGGraphics")(x.asInstanceOf[js.Any])
    
    object UNSUPPORTED_FEATURES {
      
      @JSImport("react-pdf/dist/pdfjs-dist", "default.UNSUPPORTED_FEATURES.errorColorSpace")
      @js.native
      val errorColorSpace: String = js.native
      
      @JSImport("react-pdf/dist/pdfjs-dist", "default.UNSUPPORTED_FEATURES.errorContentSubStream")
      @js.native
      val errorContentSubStream: String = js.native
      
      @JSImport("react-pdf/dist/pdfjs-dist", "default.UNSUPPORTED_FEATURES.errorExtGState")
      @js.native
      val errorExtGState: String = js.native
      
      @JSImport("react-pdf/dist/pdfjs-dist", "default.UNSUPPORTED_FEATURES.errorFontBuildPath")
      @js.native
      val errorFontBuildPath: String = js.native
      
      @JSImport("react-pdf/dist/pdfjs-dist", "default.UNSUPPORTED_FEATURES.errorFontGetPath")
      @js.native
      val errorFontGetPath: String = js.native
      
      @JSImport("react-pdf/dist/pdfjs-dist", "default.UNSUPPORTED_FEATURES.errorFontLoadNative")
      @js.native
      val errorFontLoadNative: String = js.native
      
      @JSImport("react-pdf/dist/pdfjs-dist", "default.UNSUPPORTED_FEATURES.errorFontLoadType3")
      @js.native
      val errorFontLoadType3: String = js.native
      
      @JSImport("react-pdf/dist/pdfjs-dist", "default.UNSUPPORTED_FEATURES.errorFontMissing")
      @js.native
      val errorFontMissing: String = js.native
      
      @JSImport("react-pdf/dist/pdfjs-dist", "default.UNSUPPORTED_FEATURES.errorFontState")
      @js.native
      val errorFontState: String = js.native
      
      @JSImport("react-pdf/dist/pdfjs-dist", "default.UNSUPPORTED_FEATURES.errorFontToUnicode")
      @js.native
      val errorFontToUnicode: String = js.native
      
      @JSImport("react-pdf/dist/pdfjs-dist", "default.UNSUPPORTED_FEATURES.errorFontTranslate")
      @js.native
      val errorFontTranslate: String = js.native
      
      @JSImport("react-pdf/dist/pdfjs-dist", "default.UNSUPPORTED_FEATURES.errorMarkedContent")
      @js.native
      val errorMarkedContent: String = js.native
      
      @JSImport("react-pdf/dist/pdfjs-dist", "default.UNSUPPORTED_FEATURES.errorOperatorList")
      @js.native
      val errorOperatorList: String = js.native
      
      @JSImport("react-pdf/dist/pdfjs-dist", "default.UNSUPPORTED_FEATURES.errorTilingPattern")
      @js.native
      val errorTilingPattern: String = js.native
      
      @JSImport("react-pdf/dist/pdfjs-dist", "default.UNSUPPORTED_FEATURES.errorXObject")
      @js.native
      val errorXObject: String = js.native
      
      @JSImport("react-pdf/dist/pdfjs-dist", "default.UNSUPPORTED_FEATURES.font")
      @js.native
      val font: String = js.native
      
      @JSImport("react-pdf/dist/pdfjs-dist", "default.UNSUPPORTED_FEATURES.forms")
      @js.native
      val forms: String = js.native
      
      @JSImport("react-pdf/dist/pdfjs-dist", "default.UNSUPPORTED_FEATURES.javaScript")
      @js.native
      val javaScript: String = js.native
      
      @JSImport("react-pdf/dist/pdfjs-dist", "default.UNSUPPORTED_FEATURES.shadingPattern")
      @js.native
      val shadingPattern: String = js.native
      
      @JSImport("react-pdf/dist/pdfjs-dist", "default.UNSUPPORTED_FEATURES.signatures")
      @js.native
      val signatures: String = js.native
      
      @JSImport("react-pdf/dist/pdfjs-dist", "default.UNSUPPORTED_FEATURES.smask")
      @js.native
      val smask: String = js.native
      
      @JSImport("react-pdf/dist/pdfjs-dist", "default.UNSUPPORTED_FEATURES.unknown")
      @js.native
      val unknown: String = js.native
    }
    
    @JSImport("react-pdf/dist/pdfjs-dist", "default.UnexpectedResponseException")
    @js.native
    open class UnexpectedResponseException protected ()
      extends typings.pdfjsDist.mod.UnexpectedResponseException {
      def this(msg: Any, status: Any) = this()
    }
    
    @JSImport("react-pdf/dist/pdfjs-dist", "default.Util")
    @js.native
    open class Util ()
      extends typings.pdfjsDist.mod.Util
    /* static members */
    object Util {
      
      @JSImport("react-pdf/dist/pdfjs-dist", "default.Util")
      @js.native
      val ^ : js.Any = js.native
      
      inline def apply3dTransform(m: Any, v: Any): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("apply3dTransform")(m.asInstanceOf[js.Any], v.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
      
      inline def applyInverseTransform(p: Any, m: Any): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("applyInverseTransform")(p.asInstanceOf[js.Any], m.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
      
      inline def applyTransform(p: Any, m: Any): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("applyTransform")(p.asInstanceOf[js.Any], m.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
      
      inline def bezierBoundingBox(x0: Any, y0: Any, x1: Any, y1: Any, x2: Any, y2: Any, x3: Any, y3: Any): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("bezierBoundingBox")(x0.asInstanceOf[js.Any], y0.asInstanceOf[js.Any], x1.asInstanceOf[js.Any], y1.asInstanceOf[js.Any], x2.asInstanceOf[js.Any], y2.asInstanceOf[js.Any], x3.asInstanceOf[js.Any], y3.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
      
      inline def getAxialAlignedBoundingBox(r: Any, m: Any): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("getAxialAlignedBoundingBox")(r.asInstanceOf[js.Any], m.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
      
      inline def intersect(rect1: Any, rect2: Any): js.Array[Double] | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("intersect")(rect1.asInstanceOf[js.Any], rect2.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double] | Null]
      
      inline def inverseTransform(m: Any): js.Array[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("inverseTransform")(m.asInstanceOf[js.Any]).asInstanceOf[js.Array[Double]]
      
      inline def makeHexColor(r: Any, g: Any, b: Any): String = (^.asInstanceOf[js.Dynamic].applyDynamic("makeHexColor")(r.asInstanceOf[js.Any], g.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[String]
      
      inline def normalizeRect(rect: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("normalizeRect")(rect.asInstanceOf[js.Any]).asInstanceOf[Any]
      
      inline def scaleMinMax(transform: Any, minMax: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("scaleMinMax")(transform.asInstanceOf[js.Any], minMax.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      inline def singularValueDecompose2dScale(m: Any): js.Array[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("singularValueDecompose2dScale")(m.asInstanceOf[js.Any]).asInstanceOf[js.Array[Double]]
      
      inline def transform(m1: Any, m2: Any): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("transform")(m1.asInstanceOf[js.Any], m2.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
    }
    
    object VerbosityLevel {
      
      @JSImport("react-pdf/dist/pdfjs-dist", "default.VerbosityLevel.ERRORS")
      @js.native
      val ERRORS: Double = js.native
      
      @JSImport("react-pdf/dist/pdfjs-dist", "default.VerbosityLevel.INFOS")
      @js.native
      val INFOS: Double = js.native
      
      @JSImport("react-pdf/dist/pdfjs-dist", "default.VerbosityLevel.WARNINGS")
      @js.native
      val WARNINGS: Double = js.native
    }
    
    @JSImport("react-pdf/dist/pdfjs-dist", "default.XfaLayer")
    @js.native
    open class XfaLayer ()
      extends typings.pdfjsDist.mod.XfaLayer
    /* static members */
    object XfaLayer {
      
      @JSImport("react-pdf/dist/pdfjs-dist", "default.XfaLayer")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Render the XFA layer.
        *
        * @param {XfaLayerParameters} parameters
        */
      inline def render(parameters: XfaLayerParameters): TextDivs = ^.asInstanceOf[js.Dynamic].applyDynamic("render")(parameters.asInstanceOf[js.Any]).asInstanceOf[TextDivs]
      
      inline def setAttributes(param0: Element): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setAttributes")(param0.asInstanceOf[js.Any]).asInstanceOf[Unit]
      
      inline def setupStorage(html: Any, id: Any, element: Any, storage: Any, intent: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setupStorage")(html.asInstanceOf[js.Any], id.asInstanceOf[js.Any], element.asInstanceOf[js.Any], storage.asInstanceOf[js.Any], intent.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      /**
        * Update the XFA layer.
        *
        * @param {XfaLayerParameters} parameters
        */
      inline def update(parameters: XfaLayerParameters): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("update")(parameters.asInstanceOf[js.Any]).asInstanceOf[Unit]
    }
    
    @JSImport("react-pdf/dist/pdfjs-dist", "default.build")
    @js.native
    val build: String = js.native
    
    inline def createPromiseCapability(): PromiseCapability = ^.asInstanceOf[js.Dynamic].applyDynamic("createPromiseCapability")().asInstanceOf[PromiseCapability]
    
    inline def createValidAbsoluteUrl(url: String): URL | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("createValidAbsoluteUrl")(url.asInstanceOf[js.Any]).asInstanceOf[URL | Null]
    inline def createValidAbsoluteUrl(url: String, baseUrl: String): URL | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("createValidAbsoluteUrl")(url.asInstanceOf[js.Any], baseUrl.asInstanceOf[js.Any])).asInstanceOf[URL | Null]
    inline def createValidAbsoluteUrl(url: String, baseUrl: String, options: js.Object): URL | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("createValidAbsoluteUrl")(url.asInstanceOf[js.Any], baseUrl.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[URL | Null]
    inline def createValidAbsoluteUrl(url: String, baseUrl: Unit, options: js.Object): URL | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("createValidAbsoluteUrl")(url.asInstanceOf[js.Any], baseUrl.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[URL | Null]
    inline def createValidAbsoluteUrl(url: String, baseUrl: URL): URL | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("createValidAbsoluteUrl")(url.asInstanceOf[js.Any], baseUrl.asInstanceOf[js.Any])).asInstanceOf[URL | Null]
    inline def createValidAbsoluteUrl(url: String, baseUrl: URL, options: js.Object): URL | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("createValidAbsoluteUrl")(url.asInstanceOf[js.Any], baseUrl.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[URL | Null]
    inline def createValidAbsoluteUrl(url: URL): URL | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("createValidAbsoluteUrl")(url.asInstanceOf[js.Any]).asInstanceOf[URL | Null]
    inline def createValidAbsoluteUrl(url: URL, baseUrl: String): URL | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("createValidAbsoluteUrl")(url.asInstanceOf[js.Any], baseUrl.asInstanceOf[js.Any])).asInstanceOf[URL | Null]
    inline def createValidAbsoluteUrl(url: URL, baseUrl: String, options: js.Object): URL | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("createValidAbsoluteUrl")(url.asInstanceOf[js.Any], baseUrl.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[URL | Null]
    inline def createValidAbsoluteUrl(url: URL, baseUrl: Unit, options: js.Object): URL | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("createValidAbsoluteUrl")(url.asInstanceOf[js.Any], baseUrl.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[URL | Null]
    inline def createValidAbsoluteUrl(url: URL, baseUrl: URL): URL | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("createValidAbsoluteUrl")(url.asInstanceOf[js.Any], baseUrl.asInstanceOf[js.Any])).asInstanceOf[URL | Null]
    inline def createValidAbsoluteUrl(url: URL, baseUrl: URL, options: js.Object): URL | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("createValidAbsoluteUrl")(url.asInstanceOf[js.Any], baseUrl.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[URL | Null]
    
    inline def getDocument(src: GetDocumentParameters): PDFDocumentLoadingTask = ^.asInstanceOf[js.Dynamic].applyDynamic("getDocument")(src.asInstanceOf[js.Any]).asInstanceOf[PDFDocumentLoadingTask]
    
    inline def getFilenameFromUrl(url: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getFilenameFromUrl")(url.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def getPdfFilenameFromUrl(url: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getPdfFilenameFromUrl")(url.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def getPdfFilenameFromUrl(url: String, defaultFilename: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getPdfFilenameFromUrl")(url.asInstanceOf[js.Any], defaultFilename.asInstanceOf[js.Any])).asInstanceOf[String]
    
    inline def getXfaPageViewport(xfaPage: Any, param1: Rotation): typings.pdfjsDist.typesSrcDisplayDisplayUtilsMod.PageViewport = (^.asInstanceOf[js.Dynamic].applyDynamic("getXfaPageViewport")(xfaPage.asInstanceOf[js.Any], param1.asInstanceOf[js.Any])).asInstanceOf[typings.pdfjsDist.typesSrcDisplayDisplayUtilsMod.PageViewport]
    
    inline def isPdfFile(filename: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPdfFile")(filename.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def loadScript(src: String): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("loadScript")(src.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
    inline def loadScript(src: String, removeScriptElement: Boolean): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("loadScript")(src.asInstanceOf[js.Any], removeScriptElement.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    
    inline def renderTextLayer(renderParameters: TextLayerRenderParameters): TextLayerRenderTask = ^.asInstanceOf[js.Dynamic].applyDynamic("renderTextLayer")(renderParameters.asInstanceOf[js.Any]).asInstanceOf[TextLayerRenderTask]
    
    inline def shadow(obj: Any, prop: Any, value: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("shadow")(obj.asInstanceOf[js.Any], prop.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Any]
    
    @JSImport("react-pdf/dist/pdfjs-dist", "default.version")
    @js.native
    val version: String = js.native
  }
}
