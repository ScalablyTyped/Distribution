package typings.propertyInformation

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("property-information", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def find(schema: typings.propertyInformation.libFindMod.Schema, value: String): typings.propertyInformation.libUtilInfoMod.Info = (^.asInstanceOf[js.Dynamic].applyDynamic("find")(schema.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[typings.propertyInformation.libUtilInfoMod.Info]
  
  @JSImport("property-information", "hastToReact")
  @js.native
  val hastToReact: Record[String, String] = js.native
  
  @JSImport("property-information", "html")
  @js.native
  val html: typings.propertyInformation.libUtilSchemaMod.Schema = js.native
  
  inline def normalize(value: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("normalize")(value.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @JSImport("property-information", "svg")
  @js.native
  val svg: typings.propertyInformation.libUtilSchemaMod.Schema = js.native
  
  type Info = typings.propertyInformation.libUtilInfoMod.Info
  
  type Schema = typings.propertyInformation.libUtilSchemaMod.Schema
}
