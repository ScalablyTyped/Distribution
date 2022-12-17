package typings.ranjs.global.ranjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object core {
  
  @JSGlobal("ranjs.core")
  @js.native
  val ^ : js.Any = js.native
  
  inline def char(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("char")().asInstanceOf[Unit]
  inline def char(values: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("char")(values.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def char(values: String, n: Double): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("char")(values.asInstanceOf[js.Any], n.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  
  inline def choice(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("choice")().asInstanceOf[Unit]
  inline def choice[T](values: js.Array[T]): T = ^.asInstanceOf[js.Dynamic].applyDynamic("choice")(values.asInstanceOf[js.Any]).asInstanceOf[T]
  inline def choice[T](values: js.Array[T], n: Double): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("choice")(values.asInstanceOf[js.Any], n.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  
  inline def coin[T, U](head: T, tail: U): T | U = (^.asInstanceOf[js.Dynamic].applyDynamic("coin")(head.asInstanceOf[js.Any], tail.asInstanceOf[js.Any])).asInstanceOf[T | U]
  inline def coin[T, U](head: T, tail: U, p: Double): T | U = (^.asInstanceOf[js.Dynamic].applyDynamic("coin")(head.asInstanceOf[js.Any], tail.asInstanceOf[js.Any], p.asInstanceOf[js.Any])).asInstanceOf[T | U]
  inline def coin[T, U](head: T, tail: U, p: Double, n: Double): js.Array[T | U] = (^.asInstanceOf[js.Dynamic].applyDynamic("coin")(head.asInstanceOf[js.Any], tail.asInstanceOf[js.Any], p.asInstanceOf[js.Any], n.asInstanceOf[js.Any])).asInstanceOf[js.Array[T | U]]
  
  inline def float(max: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("float")(max.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def float(min: Double, max: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("float")(min.asInstanceOf[js.Any], max.asInstanceOf[js.Any])).asInstanceOf[Double]
  // tslint:disable-line unified-signatures
  inline def float(min: Double, max: Double, n: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("float")(min.asInstanceOf[js.Any], max.asInstanceOf[js.Any], n.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  
  inline def int(max: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("int")(max.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def int(min: Double, max: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("int")(min.asInstanceOf[js.Any], max.asInstanceOf[js.Any])).asInstanceOf[Double]
  // tslint:disable-line unified-signatures
  inline def int(min: Double, max: Double, n: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("int")(min.asInstanceOf[js.Any], max.asInstanceOf[js.Any], n.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  
  inline def seed(value: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("seed")(value.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def seed(value: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("seed")(value.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def shuffle[T](values: js.Array[T]): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("shuffle")(values.asInstanceOf[js.Any]).asInstanceOf[js.Array[T]]
}
