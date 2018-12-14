package typings
package sharepointLib.SPClientTemplatesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait RenderContext_FieldInView extends RenderContext_ItemInView {
  /** If in grid mode (context.inGridMode == true), cast to FieldSchema_InForm, otherwise cast to FieldSchema_InView */
  var CurrentFieldSchema: FieldSchema_InForm | FieldSchema_InView
  var CurrentFieldValue: js.Any
  var FieldControlsModes: org.scalablytyped.runtime.StringDictionary[ClientControlMode]
  var FormContext: ClientFormContext
  var FormUniqueId: java.lang.String
}

