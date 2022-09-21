package typings.propertyInformation

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("property-information", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def find(schema: typings.propertyInformation.findMod.Schema, value: String): typings.propertyInformation.infoMod.Info = (^.asInstanceOf[js.Dynamic].applyDynamic("find")(schema.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[typings.propertyInformation.infoMod.Info]
  
  object hastToReact {
    
    @JSImport("property-information", "hastToReact.classId")
    @js.native
    val classId: String = js.native
    
    @JSImport("property-information", "hastToReact.dataType")
    @js.native
    val dataType: String = js.native
    
    @JSImport("property-information", "hastToReact.itemId")
    @js.native
    val itemId: String = js.native
    
    @JSImport("property-information", "hastToReact.strokeDashArray")
    @js.native
    val strokeDashArray: String = js.native
    
    @JSImport("property-information", "hastToReact.strokeDashOffset")
    @js.native
    val strokeDashOffset: String = js.native
    
    @JSImport("property-information", "hastToReact.strokeLineCap")
    @js.native
    val strokeLineCap: String = js.native
    
    @JSImport("property-information", "hastToReact.strokeLineJoin")
    @js.native
    val strokeLineJoin: String = js.native
    
    @JSImport("property-information", "hastToReact.strokeMiterLimit")
    @js.native
    val strokeMiterLimit: String = js.native
    
    @JSImport("property-information", "hastToReact.typeOf")
    @js.native
    val typeOf: String = js.native
    
    @JSImport("property-information", "hastToReact.xLinkActuate")
    @js.native
    val xLinkActuate: String = js.native
    
    @JSImport("property-information", "hastToReact.xLinkArcRole")
    @js.native
    val xLinkArcRole: String = js.native
    
    @JSImport("property-information", "hastToReact.xLinkHref")
    @js.native
    val xLinkHref: String = js.native
    
    @JSImport("property-information", "hastToReact.xLinkRole")
    @js.native
    val xLinkRole: String = js.native
    
    @JSImport("property-information", "hastToReact.xLinkShow")
    @js.native
    val xLinkShow: String = js.native
    
    @JSImport("property-information", "hastToReact.xLinkTitle")
    @js.native
    val xLinkTitle: String = js.native
    
    @JSImport("property-information", "hastToReact.xLinkType")
    @js.native
    val xLinkType: String = js.native
    
    @JSImport("property-information", "hastToReact.xmlnsXLink")
    @js.native
    val xmlnsXLink: String = js.native
  }
  
  @JSImport("property-information", "html")
  @js.native
  val html: typings.propertyInformation.schemaMod.Schema = js.native
  
  inline def normalize(value: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("normalize")(value.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @JSImport("property-information", "svg")
  @js.native
  val svg: typings.propertyInformation.schemaMod.Schema = js.native
  
  type Info = typings.propertyInformation.infoMod.Info
  
  type Schema = typings.propertyInformation.schemaMod.Schema
}
