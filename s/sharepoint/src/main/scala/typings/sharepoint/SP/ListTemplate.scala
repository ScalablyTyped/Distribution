package typings.sharepoint.SP

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListTemplate extends ClientObject {
  def get_allowsFolderCreation(): Boolean = js.native
  def get_baseType(): BaseType = js.native
  def get_description(): String = js.native
  def get_featureId(): Guid = js.native
  def get_hidden(): Boolean = js.native
  def get_imageUrl(): String = js.native
  def get_internalName(): String = js.native
  def get_isCustomTemplate(): Boolean = js.native
  def get_listTemplateTypeKind(): Double = js.native
  def get_name(): String = js.native
  def get_onQuickLaunch(): Boolean = js.native
  def get_unique(): Boolean = js.native
}

