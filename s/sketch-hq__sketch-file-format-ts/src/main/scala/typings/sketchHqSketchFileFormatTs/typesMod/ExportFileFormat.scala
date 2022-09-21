package typings.sketchHqSketchFileFormatTs.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ExportFileFormat extends StObject
@JSImport("@sketch-hq/sketch-file-format-ts/dist/cjs/types", "ExportFileFormat")
@js.native
object ExportFileFormat extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ExportFileFormat & String] = js.native
  
  @js.native
  sealed trait EPS
    extends StObject
       with ExportFileFormat
  /* "eps" */ val EPS: typings.sketchHqSketchFileFormatTs.typesMod.ExportFileFormat.EPS & String = js.native
  
  @js.native
  sealed trait JPG
    extends StObject
       with ExportFileFormat
  /* "jpg" */ val JPG: typings.sketchHqSketchFileFormatTs.typesMod.ExportFileFormat.JPG & String = js.native
  
  @js.native
  sealed trait PDF
    extends StObject
       with ExportFileFormat
  /* "pdf" */ val PDF: typings.sketchHqSketchFileFormatTs.typesMod.ExportFileFormat.PDF & String = js.native
  
  @js.native
  sealed trait PNG
    extends StObject
       with ExportFileFormat
  /* "png" */ val PNG: typings.sketchHqSketchFileFormatTs.typesMod.ExportFileFormat.PNG & String = js.native
  
  @js.native
  sealed trait SVG
    extends StObject
       with ExportFileFormat
  /* "svg" */ val SVG: typings.sketchHqSketchFileFormatTs.typesMod.ExportFileFormat.SVG & String = js.native
  
  @js.native
  sealed trait TIFF
    extends StObject
       with ExportFileFormat
  /* "tiff" */ val TIFF: typings.sketchHqSketchFileFormatTs.typesMod.ExportFileFormat.TIFF & String = js.native
  
  @js.native
  sealed trait WEBP
    extends StObject
       with ExportFileFormat
  /* "webp" */ val WEBP: typings.sketchHqSketchFileFormatTs.typesMod.ExportFileFormat.WEBP & String = js.native
}
