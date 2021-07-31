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
  
  @scala.inline
  def getRandomColor(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getRandomColor")().asInstanceOf[String]
  
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
    
    @scala.inline
    def apply(name: String, province: Double, shape: String, zip: Double): DistrictMapTypes = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], province = province.asInstanceOf[js.Any], shape = shape.asInstanceOf[js.Any], zip = zip.asInstanceOf[js.Any])
      __obj.asInstanceOf[DistrictMapTypes]
    }
    
    @scala.inline
    implicit class DistrictMapTypesMutableBuilder[Self <: DistrictMapTypes] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setProvince(value: Double): Self = StObject.set(x, "province", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZip(value: Double): Self = StObject.set(x, "zip", value.asInstanceOf[js.Any])
    }
  }
  
  trait MapMetaDataTypes extends StObject {
    
    var name: String
    
    var shape: String
  }
  object MapMetaDataTypes {
    
    @scala.inline
    def apply(name: String, shape: String): MapMetaDataTypes = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], shape = shape.asInstanceOf[js.Any])
      __obj.asInstanceOf[MapMetaDataTypes]
    }
    
    @scala.inline
    implicit class MapMetaDataTypesMutableBuilder[Self <: MapMetaDataTypes] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShape(value: String): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
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
    
    @scala.inline
    def apply(): MapPropsTypes = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MapPropsTypes]
    }
    
    @scala.inline
    implicit class MapPropsTypesMutableBuilder[Self <: MapPropsTypes] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setContainerClassName(value: String): Self = StObject.set(x, "containerClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContainerClassNameUndefined: Self = StObject.set(x, "containerClassName", js.undefined)
      
      @scala.inline
      def setHoverColor(value: String): Self = StObject.set(x, "hoverColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHoverColorUndefined: Self = StObject.set(x, "hoverColor", js.undefined)
      
      @scala.inline
      def setOnMapClick(value: /* item */ itemProps => Unit): Self = StObject.set(x, "onMapClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnMapClickUndefined: Self = StObject.set(x, "onMapClick", js.undefined)
      
      @scala.inline
      def setRandomSectorColor(value: Boolean): Self = StObject.set(x, "randomSectorColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRandomSectorColorUndefined: Self = StObject.set(x, "randomSectorColor", js.undefined)
      
      @scala.inline
      def setSectorClassName(value: String): Self = StObject.set(x, "sectorClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSectorClassNameUndefined: Self = StObject.set(x, "sectorClassName", js.undefined)
      
      @scala.inline
      def setStroke(value: String): Self = StObject.set(x, "stroke", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrokeUndefined: Self = StObject.set(x, "stroke", js.undefined)
      
      @scala.inline
      def setStrokeWidth(value: Double): Self = StObject.set(x, "strokeWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrokeWidthUndefined: Self = StObject.set(x, "strokeWidth", js.undefined)
    }
  }
  
  trait ProvinceMapPropsTypes
    extends StObject
       with MapPropsTypes {
    
    var provinceColor: js.UndefOr[js.Array[String]] = js.undefined
  }
  object ProvinceMapPropsTypes {
    
    @scala.inline
    def apply(): ProvinceMapPropsTypes = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ProvinceMapPropsTypes]
    }
    
    @scala.inline
    implicit class ProvinceMapPropsTypesMutableBuilder[Self <: ProvinceMapPropsTypes] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setProvinceColor(value: js.Array[String]): Self = StObject.set(x, "provinceColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProvinceColorUndefined: Self = StObject.set(x, "provinceColor", js.undefined)
      
      @scala.inline
      def setProvinceColorVarargs(value: String*): Self = StObject.set(x, "provinceColor", js.Array(value :_*))
    }
  }
  
  trait ProvinceMapTypes
    extends StObject
       with MapMetaDataTypes {
    
    var zip: Double
  }
  object ProvinceMapTypes {
    
    @scala.inline
    def apply(name: String, shape: String, zip: Double): ProvinceMapTypes = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], shape = shape.asInstanceOf[js.Any], zip = zip.asInstanceOf[js.Any])
      __obj.asInstanceOf[ProvinceMapTypes]
    }
    
    @scala.inline
    implicit class ProvinceMapTypesMutableBuilder[Self <: ProvinceMapTypes] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setZip(value: Double): Self = StObject.set(x, "zip", value.asInstanceOf[js.Any])
    }
  }
  
  trait ZonalMapTypes
    extends StObject
       with MapMetaDataTypes {
    
    var code: String
  }
  object ZonalMapTypes {
    
    @scala.inline
    def apply(code: String, name: String, shape: String): ZonalMapTypes = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], shape = shape.asInstanceOf[js.Any])
      __obj.asInstanceOf[ZonalMapTypes]
    }
    
    @scala.inline
    implicit class ZonalMapTypesMutableBuilder[Self <: ZonalMapTypes] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    }
  }
  
  trait itemProps extends StObject {
    
    var code: String
    
    var name: String
    
    var province: Double
    
    var zip: Double
  }
  object itemProps {
    
    @scala.inline
    def apply(code: String, name: String, province: Double, zip: Double): itemProps = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], province = province.asInstanceOf[js.Any], zip = zip.asInstanceOf[js.Any])
      __obj.asInstanceOf[itemProps]
    }
    
    @scala.inline
    implicit class itemPropsMutableBuilder[Self <: itemProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProvince(value: Double): Self = StObject.set(x, "province", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZip(value: Double): Self = StObject.set(x, "zip", value.asInstanceOf[js.Any])
    }
  }
}
