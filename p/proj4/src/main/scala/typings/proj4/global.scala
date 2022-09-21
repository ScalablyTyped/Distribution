package typings.proj4

import typings.proj4.mod.Converter
import typings.proj4.mod.InterfaceCoordinates
import typings.proj4.mod.InterfaceProjection
import typings.proj4.mod.ProjectionDefinition
import typings.proj4.mod.TemplateCoordinates
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object proj4 {
    
    inline def apply(fromProjection: String): Converter = ^.asInstanceOf[js.Dynamic].apply(fromProjection.asInstanceOf[js.Any]).asInstanceOf[Converter]
    inline def apply(fromProjection: String, toProjection: String): Converter = (^.asInstanceOf[js.Dynamic].apply(fromProjection.asInstanceOf[js.Any], toProjection.asInstanceOf[js.Any])).asInstanceOf[Converter]
    inline def apply(fromProjection: String, toProjection: String, coordinates: js.Array[Double]): js.Array[Double] = (^.asInstanceOf[js.Dynamic].apply(fromProjection.asInstanceOf[js.Any], toProjection.asInstanceOf[js.Any], coordinates.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
    inline def apply(fromProjection: String, toProjection: String, coordinates: InterfaceCoordinates): InterfaceCoordinates = (^.asInstanceOf[js.Dynamic].apply(fromProjection.asInstanceOf[js.Any], toProjection.asInstanceOf[js.Any], coordinates.asInstanceOf[js.Any])).asInstanceOf[InterfaceCoordinates]
    inline def apply(toProjection: String, coordinates: js.Array[Double]): js.Array[Double] = (^.asInstanceOf[js.Dynamic].apply(toProjection.asInstanceOf[js.Any], coordinates.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
    inline def apply(toProjection: String, coordinates: InterfaceCoordinates): InterfaceCoordinates = (^.asInstanceOf[js.Dynamic].apply(toProjection.asInstanceOf[js.Any], coordinates.asInstanceOf[js.Any])).asInstanceOf[InterfaceCoordinates]
    
    @JSGlobal("proj4")
    @js.native
    val ^ : js.Any = js.native
    
    inline def Point(coordinates: String): InterfaceCoordinates = ^.asInstanceOf[js.Dynamic].applyDynamic("Point")(coordinates.asInstanceOf[js.Any]).asInstanceOf[InterfaceCoordinates]
    inline def Point(coordinates: TemplateCoordinates): InterfaceCoordinates = ^.asInstanceOf[js.Dynamic].applyDynamic("Point")(coordinates.asInstanceOf[js.Any]).asInstanceOf[InterfaceCoordinates]
    /**
      * @deprecated v3
      */
    inline def Point(x: Double, y: Double): InterfaceCoordinates = (^.asInstanceOf[js.Dynamic].applyDynamic("Point")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[InterfaceCoordinates]
    inline def Point(x: Double, y: Double, z: Double): InterfaceCoordinates = (^.asInstanceOf[js.Dynamic].applyDynamic("Point")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], z.asInstanceOf[js.Any])).asInstanceOf[InterfaceCoordinates]
    
    inline def Proj(srsCode: Any): InterfaceProjection = ^.asInstanceOf[js.Dynamic].applyDynamic("Proj")(srsCode.asInstanceOf[js.Any]).asInstanceOf[InterfaceProjection]
    inline def Proj(srsCode: Any, callback: Any): InterfaceProjection = (^.asInstanceOf[js.Dynamic].applyDynamic("Proj")(srsCode.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[InterfaceProjection]
    
    @JSGlobal("proj4.WGS84")
    @js.native
    val WGS84: Any = js.native
    
    @JSGlobal("proj4.defaultDatum")
    @js.native
    val defaultDatum: String = js.native
    
    inline def defs(name: String): ProjectionDefinition = ^.asInstanceOf[js.Dynamic].applyDynamic("defs")(name.asInstanceOf[js.Any]).asInstanceOf[ProjectionDefinition]
    inline def defs(name: String, projection: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("defs")(name.asInstanceOf[js.Any], projection.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def defs(name: String, projection: ProjectionDefinition): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("defs")(name.asInstanceOf[js.Any], projection.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def defs(name: js.Array[js.Array[String]]): js.Array[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("defs")(name.asInstanceOf[js.Any]).asInstanceOf[js.Array[Unit]]
    
    inline def mgrs(coordinates: js.Array[Double], accuracy: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("mgrs")(coordinates.asInstanceOf[js.Any], accuracy.asInstanceOf[js.Any])).asInstanceOf[String]
    
    inline def nadgrid(key: String, grid: js.typedarray.ArrayBuffer): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("nadgrid")(key.asInstanceOf[js.Any], grid.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def toPoint(array: js.Array[Double]): InterfaceCoordinates = ^.asInstanceOf[js.Dynamic].applyDynamic("toPoint")(array.asInstanceOf[js.Any]).asInstanceOf[InterfaceCoordinates]
    
    inline def transform(source: InterfaceProjection, dest: InterfaceProjection, point: TemplateCoordinates): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("transform")(source.asInstanceOf[js.Any], dest.asInstanceOf[js.Any], point.asInstanceOf[js.Any])).asInstanceOf[Any]
    
    @JSGlobal("proj4.version")
    @js.native
    val version: String = js.native
  }
}
