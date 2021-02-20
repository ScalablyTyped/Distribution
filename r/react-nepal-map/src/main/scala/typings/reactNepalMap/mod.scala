package typings.reactNepalMap

import typings.react.mod.FC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
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
  
  @JSImport("react-nepal-map", "getRandomColor")
  @js.native
  def getRandomColor(): String = js.native
  
  @JSImport("react-nepal-map", "provinceMapData")
  @js.native
  val provinceMapData: js.Array[ProvinceMapTypes] = js.native
  
  @JSImport("react-nepal-map", "zonalMapData")
  @js.native
  val zonalMapData: js.Array[ZonalMapTypes] = js.native
  
  @js.native
  trait DistrictMapTypes extends MapMetaDataTypes {
    
    var province: Double = js.native
    
    var zip: Double = js.native
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
  
  @js.native
  trait MapMetaDataTypes extends StObject {
    
    var name: String = js.native
    
    var shape: String = js.native
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
  
  @js.native
  trait MapPropsTypes extends StObject {
    
    var color: js.UndefOr[String] = js.native
    
    var containerClassName: js.UndefOr[String] = js.native
    
    var hoverColor: js.UndefOr[String] = js.native
    
    var onMapClick: js.UndefOr[js.Function1[/* item */ itemProps, Unit]] = js.native
    
    var randomSectorColor: js.UndefOr[Boolean] = js.native
    
    var sectorClassName: js.UndefOr[String] = js.native
    
    var stroke: js.UndefOr[String] = js.native
    
    var strokeWidth: js.UndefOr[Double] = js.native
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
  
  @js.native
  trait ProvinceMapPropsTypes extends MapPropsTypes {
    
    var provinceColor: js.UndefOr[js.Array[String]] = js.native
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
  
  @js.native
  trait ProvinceMapTypes extends MapMetaDataTypes {
    
    var zip: Double = js.native
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
  
  @js.native
  trait ZonalMapTypes extends MapMetaDataTypes {
    
    var code: String = js.native
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
  
  @js.native
  trait itemProps extends StObject {
    
    var code: String = js.native
    
    var name: String = js.native
    
    var province: Double = js.native
    
    var zip: Double = js.native
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
