package typings.reactTagcloud

import typings.react.mod.ComponentType
import typings.reactTagcloud.reactTagCloud.TagCloud
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object reactTagcloudComponents extends reactTagcloudProps {
  @scala.inline
  def ReactTagCloudTagCloud: ComponentType[ReactTagCloudTagCloudProps] = TagCloud.asInstanceOf[ComponentType[ReactTagCloudTagCloudProps]]
  @scala.inline
  def TagCloud: ComponentType[TagCloudProps] = js.constructorOf[typings.reactTagcloud.mod.TagCloud].asInstanceOf[ComponentType[TagCloudProps]]
}

