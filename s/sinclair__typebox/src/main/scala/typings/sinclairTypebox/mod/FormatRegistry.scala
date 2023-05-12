package typings.sinclairTypebox.mod

import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object FormatRegistry {
  
  @JSImport("@sinclair/typebox", "FormatRegistry")
  @js.native
  val ^ : js.Any = js.native
  
  /** Clears all user defined string formats */
  inline def Clear(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("Clear")().asInstanceOf[Unit]
  
  /** Returns the entries in this registry */
  inline def Entries(): Map[String, FormatRegistryValidationFunction] = ^.asInstanceOf[js.Dynamic].applyDynamic("Entries")().asInstanceOf[Map[String, FormatRegistryValidationFunction]]
  
  /** Gets a validation function for a user defined string format */
  inline def Get(format: String): js.UndefOr[FormatRegistryValidationFunction] = ^.asInstanceOf[js.Dynamic].applyDynamic("Get")(format.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[FormatRegistryValidationFunction]]
  
  /** Returns true if the user defined string format exists */
  inline def Has(format: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("Has")(format.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  /** Sets a validation function for a user defined string format */
  inline def Set(format: String, func: FormatRegistryValidationFunction): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("Set")(format.asInstanceOf[js.Any], func.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
