package typings.rechartsScale

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("recharts-scale", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getNiceTickValues(domain: js.Tuple2[Double, Double]): js.Array[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("getNiceTickValues")(domain.asInstanceOf[js.Any]).asInstanceOf[js.Array[Double]]
  inline def getNiceTickValues(domain: js.Tuple2[Double, Double], tickCount: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("getNiceTickValues")(domain.asInstanceOf[js.Any], tickCount.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  inline def getNiceTickValues(domain: js.Tuple2[Double, Double], tickCount: Double, allowDecimals: Boolean): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("getNiceTickValues")(domain.asInstanceOf[js.Any], tickCount.asInstanceOf[js.Any], allowDecimals.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  inline def getNiceTickValues(domain: js.Tuple2[Double, Double], tickCount: Unit, allowDecimals: Boolean): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("getNiceTickValues")(domain.asInstanceOf[js.Any], tickCount.asInstanceOf[js.Any], allowDecimals.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  
  inline def getTickValues(domain: js.Tuple2[Double, Double]): js.Array[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("getTickValues")(domain.asInstanceOf[js.Any]).asInstanceOf[js.Array[Double]]
  inline def getTickValues(domain: js.Tuple2[Double, Double], tickCount: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("getTickValues")(domain.asInstanceOf[js.Any], tickCount.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  inline def getTickValues(domain: js.Tuple2[Double, Double], tickCount: Double, allowDecimals: Boolean): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("getTickValues")(domain.asInstanceOf[js.Any], tickCount.asInstanceOf[js.Any], allowDecimals.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  inline def getTickValues(domain: js.Tuple2[Double, Double], tickCount: Unit, allowDecimals: Boolean): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("getTickValues")(domain.asInstanceOf[js.Any], tickCount.asInstanceOf[js.Any], allowDecimals.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  
  inline def getTickValuesFixedDomain(domain: js.Tuple2[Double, Double]): js.Array[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("getTickValuesFixedDomain")(domain.asInstanceOf[js.Any]).asInstanceOf[js.Array[Double]]
  inline def getTickValuesFixedDomain(domain: js.Tuple2[Double, Double], tickCount: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("getTickValuesFixedDomain")(domain.asInstanceOf[js.Any], tickCount.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  inline def getTickValuesFixedDomain(domain: js.Tuple2[Double, Double], tickCount: Double, allowDecimals: Boolean): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("getTickValuesFixedDomain")(domain.asInstanceOf[js.Any], tickCount.asInstanceOf[js.Any], allowDecimals.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  inline def getTickValuesFixedDomain(domain: js.Tuple2[Double, Double], tickCount: Unit, allowDecimals: Boolean): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("getTickValuesFixedDomain")(domain.asInstanceOf[js.Any], tickCount.asInstanceOf[js.Any], allowDecimals.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
}
