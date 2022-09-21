package typings.reactNepalMap

import typings.react.mod.FC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-nepal-map", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("react-nepal-map", "DistrictMap")
  @js.native
  val DistrictMap: FC[MapPropsTypes] = js.native
  
  @JSImport("react-nepal-map", "ProvinceMap")
  @js.native
  val ProvinceMap: FC[ProvinceMapPropsTypes] = js.native
  
  @JSImport("react-nepal-map", "ZonalMap")
  @js.native
  val ZonalMap: FC[MapPropsTypes] = js.native
  
  @JSImport("react-nepal-map", "districtMapData")
  @js.native
  val districtMapData: js.Array[DistrictMapTypes] = js.native
  
  inline def getRandomColor(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getRandomColor")().asInstanceOf[String]
  
  @JSImport("react-nepal-map", "provinceMapData")
  @js.native
  val provinceMapData: js.Array[ProvinceMapTypes] = js.native
  
  @JSImport("react-nepal-map", "zonalMapData")
  @js.native
  val zonalMapData: js.Array[ZonalMapTypes] = js.native
  
  trait DistrictMapTypes
    extends StObject
       with MapMetaDataTypes {
    
    var province: Double
    
    var zip: Double
  }
  object DistrictMapTypes {
    
    inline def apply(name: String, province: Double, shape: String, zip: Double): DistrictMapTypes = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], province = province.asInstanceOf[js.Any], shape = shape.asInstanceOf[js.Any], zip = zip.asInstanceOf[js.Any])
      __obj.asInstanceOf[DistrictMapTypes]
    }
    
    extension [Self <: DistrictMapTypes](x: Self) {
      
      inline def setProvince(value: Double): Self = StObject.set(x, "province", value.asInstanceOf[js.Any])
      
      inline def setZip(value: Double): Self = StObject.set(x, "zip", value.asInstanceOf[js.Any])
    }
  }
  
  trait MapMetaDataTypes extends StObject {
    
    var name: String
    
    var shape: String
  }
  object MapMetaDataTypes {
    
    inline def apply(name: String, shape: String): MapMetaDataTypes = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], shape = shape.asInstanceOf[js.Any])
      __obj.asInstanceOf[MapMetaDataTypes]
    }
    
    extension [Self <: MapMetaDataTypes](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setShape(value: String): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
    }
  }
  
  trait MapPropsTypes extends StObject {
    
    var color: js.UndefOr[String] = js.undefined
    
    var containerClassName: js.UndefOr[String] = js.undefined
    
    var hoverColor: js.UndefOr[String] = js.undefined
    
    var onMapClick: js.UndefOr[js.Function1[/* item */ itemProps, Unit]] = js.undefined
    
    var randomSectorColor: js.UndefOr[Boolean] = js.undefined
    
    var sectorClassName: js.UndefOr[String] = js.undefined
    
    var stroke: js.UndefOr[String] = js.undefined
    
    var strokeWidth: js.UndefOr[Double] = js.undefined
  }
  object MapPropsTypes {
    
    inline def apply(): MapPropsTypes = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MapPropsTypes]
    }
    
    extension [Self <: MapPropsTypes](x: Self) {
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setContainerClassName(value: String): Self = StObject.set(x, "containerClassName", value.asInstanceOf[js.Any])
      
      inline def setContainerClassNameUndefined: Self = StObject.set(x, "containerClassName", js.undefined)
      
      inline def setHoverColor(value: String): Self = StObject.set(x, "hoverColor", value.asInstanceOf[js.Any])
      
      inline def setHoverColorUndefined: Self = StObject.set(x, "hoverColor", js.undefined)
      
      inline def setOnMapClick(value: /* item */ itemProps => Unit): Self = StObject.set(x, "onMapClick", js.Any.fromFunction1(value))
      
      inline def setOnMapClickUndefined: Self = StObject.set(x, "onMapClick", js.undefined)
      
      inline def setRandomSectorColor(value: Boolean): Self = StObject.set(x, "randomSectorColor", value.asInstanceOf[js.Any])
      
      inline def setRandomSectorColorUndefined: Self = StObject.set(x, "randomSectorColor", js.undefined)
      
      inline def setSectorClassName(value: String): Self = StObject.set(x, "sectorClassName", value.asInstanceOf[js.Any])
      
      inline def setSectorClassNameUndefined: Self = StObject.set(x, "sectorClassName", js.undefined)
      
      inline def setStroke(value: String): Self = StObject.set(x, "stroke", value.asInstanceOf[js.Any])
      
      inline def setStrokeUndefined: Self = StObject.set(x, "stroke", js.undefined)
      
      inline def setStrokeWidth(value: Double): Self = StObject.set(x, "strokeWidth", value.asInstanceOf[js.Any])
      
      inline def setStrokeWidthUndefined: Self = StObject.set(x, "strokeWidth", js.undefined)
    }
  }
  
  trait ProvinceMapPropsTypes
    extends StObject
       with MapPropsTypes {
    
    var provinceColor: js.UndefOr[js.Array[String]] = js.undefined
  }
  object ProvinceMapPropsTypes {
    
    inline def apply(): ProvinceMapPropsTypes = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ProvinceMapPropsTypes]
    }
    
    extension [Self <: ProvinceMapPropsTypes](x: Self) {
      
      inline def setProvinceColor(value: js.Array[String]): Self = StObject.set(x, "provinceColor", value.asInstanceOf[js.Any])
      
      inline def setProvinceColorUndefined: Self = StObject.set(x, "provinceColor", js.undefined)
      
      inline def setProvinceColorVarargs(value: String*): Self = StObject.set(x, "provinceColor", js.Array(value*))
    }
  }
  
  trait ProvinceMapTypes
    extends StObject
       with MapMetaDataTypes {
    
    var zip: Double
  }
  object ProvinceMapTypes {
    
    inline def apply(name: String, shape: String, zip: Double): ProvinceMapTypes = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], shape = shape.asInstanceOf[js.Any], zip = zip.asInstanceOf[js.Any])
      __obj.asInstanceOf[ProvinceMapTypes]
    }
    
    extension [Self <: ProvinceMapTypes](x: Self) {
      
      inline def setZip(value: Double): Self = StObject.set(x, "zip", value.asInstanceOf[js.Any])
    }
  }
  
  trait ZonalMapTypes
    extends StObject
       with MapMetaDataTypes {
    
    var code: String
  }
  object ZonalMapTypes {
    
    inline def apply(code: String, name: String, shape: String): ZonalMapTypes = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], shape = shape.asInstanceOf[js.Any])
      __obj.asInstanceOf[ZonalMapTypes]
    }
    
    extension [Self <: ZonalMapTypes](x: Self) {
      
      inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    }
  }
  
  trait itemProps extends StObject {
    
    var code: String
    
    var name: String
    
    var province: Double
    
    var zip: Double
  }
  object itemProps {
    
    inline def apply(code: String, name: String, province: Double, zip: Double): itemProps = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], province = province.asInstanceOf[js.Any], zip = zip.asInstanceOf[js.Any])
      __obj.asInstanceOf[itemProps]
    }
    
    extension [Self <: itemProps](x: Self) {
      
      inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setProvince(value: Double): Self = StObject.set(x, "province", value.asInstanceOf[js.Any])
      
      inline def setZip(value: Double): Self = StObject.set(x, "zip", value.asInstanceOf[js.Any])
    }
  }
}
