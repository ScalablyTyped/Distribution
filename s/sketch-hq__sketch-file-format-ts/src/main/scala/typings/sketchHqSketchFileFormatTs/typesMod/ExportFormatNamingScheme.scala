package typings.sketchHqSketchFileFormatTs.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ExportFormatNamingScheme extends StObject
@JSImport("@sketch-hq/sketch-file-format-ts/dist/cjs/types", "ExportFormatNamingScheme")
@js.native
object ExportFormatNamingScheme extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ExportFormatNamingScheme & Double] = js.native
  
  @js.native
  sealed trait PrimaryPrefix
    extends StObject
       with ExportFormatNamingScheme
  /* 2 */ val PrimaryPrefix: typings.sketchHqSketchFileFormatTs.typesMod.ExportFormatNamingScheme.PrimaryPrefix & Double = js.native
  
  @js.native
  sealed trait SecondaryPrefix
    extends StObject
       with ExportFormatNamingScheme
  /* 1 */ val SecondaryPrefix: typings.sketchHqSketchFileFormatTs.typesMod.ExportFormatNamingScheme.SecondaryPrefix & Double = js.native
  
  @js.native
  sealed trait Suffix
    extends StObject
       with ExportFormatNamingScheme
  /* 0 */ val Suffix: typings.sketchHqSketchFileFormatTs.typesMod.ExportFormatNamingScheme.Suffix & Double = js.native
}
