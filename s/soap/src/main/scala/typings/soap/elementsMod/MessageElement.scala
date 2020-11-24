package typings.soap.elementsMod

import org.scalablytyped.runtime.Instantiable4
import org.scalablytyped.runtime.StringDictionary
import typings.soap.typesMod.IWsdlBaseOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("soap/lib/wsdl/elements", "MessageElement")
@js.native
class MessageElement () extends Element {
  
  /**
    * Takes a given namespaced String(for example: 'alias:property') and creates a lookupType
    * object for further use in as first (lookup) `parameterTypeObj` within the `objectToXML`
    * method and provides an entry point for the already existing code in `findChildSchemaObject`.
    *
    * @method _createLookupTypeObject
    * @param {String}            nsString          The NS String (for example "alias:type").
    * @param {Object}            xmlns       The fully parsed `wsdl` definitions object (including all schemas).
    * @returns {Object}
    * @private
    */
  var _createLookupTypeObject: js.Any = js.native
  
  /**
    * Iterates through the element and every nested child to find any defined `$type`
    * property and returns it in a underscore ('_') separated String (using '^' as default
    * value if no `$type` property was found).
    *
    * @method _getNestedLookupTypeString
    * @param {Object}            element         The element which (probably) contains nested `$type` values.
    * @returns {String}
    * @private
    */
  var _getNestedLookupTypeString: js.Any = js.native
  
  @JSName("allowedChildren")
  val allowedChildren_MessageElement: StringDictionary[
    Instantiable4[
      /* nsName */ String, 
      /* attrs */ js.Any, 
      /* options */ js.UndefOr[IWsdlBaseOptions], 
      /* schemaAttrs */ js.UndefOr[js.Any], 
      Element
    ]
  ] = js.native
  
  var element: ElementElement = js.native
  
  var parts: js.Any = js.native
  
  def postProcess(definitions: DefinitionsElement): Unit = js.native
}
