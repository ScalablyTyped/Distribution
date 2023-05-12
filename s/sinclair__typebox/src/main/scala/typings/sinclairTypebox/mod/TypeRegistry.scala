package typings.sinclairTypebox.mod

import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TypeRegistry {
  
  @JSImport("@sinclair/typebox", "TypeRegistry")
  @js.native
  val ^ : js.Any = js.native
  
  /** Clears all user defined types */
  inline def Clear(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("Clear")().asInstanceOf[Unit]
  
  /** Returns the entries in this registry */
  inline def Entries(): Map[String, TypeRegistryValidationFunction[Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("Entries")().asInstanceOf[Map[String, TypeRegistryValidationFunction[Any]]]
  
  /** Gets a custom validation function for a user defined type */
  inline def Get(kind: String): js.UndefOr[TypeRegistryValidationFunction[Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("Get")(kind.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[TypeRegistryValidationFunction[Any]]]
  
  /** Returns true if this registry contains this kind */
  inline def Has(kind: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("Has")(kind.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  /** Sets a validation function for a user defined type */
  inline def Set[TSchema](kind: String, func: TypeRegistryValidationFunction[TSchema]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("Set")(kind.asInstanceOf[js.Any], func.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
