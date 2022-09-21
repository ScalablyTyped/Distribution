package typings.samchon

import typings.samchon.ientityMod.IEntity
import typings.sxml.mod.XML
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object entityMod {
  
  @JSImport("samchon/protocol/entity/Entity", "Entity")
  @js.native
  /**
    * Default Constructor.
    */
  abstract class Entity ()
    extends StObject
       with IEntity {
    
    /**
      * A tag name when represented by XML.
      *
      * <code> <TAG {...properties} /> </code>
      */
    /* CompleteClass */
    override def TAG(): String = js.native
    
    /**
      * Construct data of the Entity from a XML object.
      *
      * Overrides the construct() method and fetch data of member variables from the XML.
      *
      * By recommended guidance, data representing member variables are contained in properties
      * of the put XML object.
      *
      * @param xml An xml used to contruct data of entity.
      */
    /* CompleteClass */
    override def construct(xml: XML): Unit = js.native
    
    /**
      * Get a key that can identify the Entity uniquely.
      *
      * If identifier of the Entity is not atomic value, returns a paired or tuple object
      * that can represents the composite identifier.
      *
      * <code>
      * class Point extends Entity
      * {
      *     private x: number;
      *     private y: number;
      *
      *     public key(): std.Pair<number, number>
      *     {
      *         return std.make_pair(this.x, this.y);
      *     }
      * }
      * </code>
      */
    /* CompleteClass */
    override def key(): Any = js.native
    
    /**
      * Get a XML object represents the Entity.
      *
      * A member variable (not object, but atomic value like number, string or date) is categorized
      * as a property within the framework of entity side. Thus, when overriding a toXML() method and
      * archiving member variables to an XML object to return, puts each variable to be a property
      * belongs to only a XML object.
      *
      * Don't archive the member variable of atomic value to XML::value causing enormouse creation
      * of XML objects to number of member variables. An Entity must be represented by only a XML
      * instance (tag).
      *
      * <h4> Standard Usage. </h4>
      * <code>
      * <memberList>
      *	<member id='jhnam88' name='Jeongho Nam' birthdate='1988-03-11' />
      *	<member id='master' name='Administartor' birthdate='2011-07-28' />
      * </memberList>
      * </code>
      *
      * <h4> Non-standard usage abusing value. </h4>
      * <code>
      * <member>
      *	<id>jhnam88</id>
      *	<name>Jeongho Nam</name>
      *	<birthdate>1988-03-11</birthdate>
      * </member>
      * <member>
      *	<id>master</id>
      *	<name>Administartor</name>
      *	<birthdate>2011-07-28</birthdate>
      * </member>
      * </code>
      *
      * @return An XML object representing the Entity.
      */
    /* CompleteClass */
    override def toXML(): XML = js.native
  }
}
