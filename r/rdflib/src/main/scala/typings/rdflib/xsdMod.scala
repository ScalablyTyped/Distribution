package typings.rdflib

import typings.rdflib.anon.Boolean
import typings.rdflib.factoryTypesMod.DataFactory
import typings.rdflib.factoryTypesMod.DefaultFactoryTypes
import typings.rdflib.factoryTypesMod.Indexable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object xsdMod {
  
  @JSImport("rdflib/lib/xsd", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object default {
    
    @JSImport("rdflib/lib/xsd", "default.boolean")
    @js.native
    val boolean: typings.rdflib.namedNodeMod.default = js.native
    
    @JSImport("rdflib/lib/xsd", "default.dateTime")
    @js.native
    val dateTime: typings.rdflib.namedNodeMod.default = js.native
    
    @JSImport("rdflib/lib/xsd", "default.decimal")
    @js.native
    val decimal: typings.rdflib.namedNodeMod.default = js.native
    
    @JSImport("rdflib/lib/xsd", "default.double")
    @js.native
    val double: typings.rdflib.namedNodeMod.default = js.native
    
    @JSImport("rdflib/lib/xsd", "default.integer")
    @js.native
    val integer: typings.rdflib.namedNodeMod.default = js.native
    
    @JSImport("rdflib/lib/xsd", "default.langString")
    @js.native
    val langString: typings.rdflib.namedNodeMod.default = js.native
    
    @JSImport("rdflib/lib/xsd", "default.string")
    @js.native
    val string: typings.rdflib.namedNodeMod.default = js.native
  }
  
  inline def createXSD(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("createXSD")().asInstanceOf[Boolean]
  inline def createXSD(localFactory: DataFactory[DefaultFactoryTypes, Indexable]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("createXSD")(localFactory.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
