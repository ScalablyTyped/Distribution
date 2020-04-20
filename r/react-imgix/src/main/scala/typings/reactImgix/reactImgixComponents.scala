package typings.reactImgix

import typings.react.mod.ComponentType
import typings.reactImgix.mod.CommonProps
import typings.reactImgix.mod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object reactImgixComponents extends reactImgixProps {
  @scala.inline
  def Background: ComponentType[BackgroundProps[typings.reactImgix.mod.BackgroundProps]] = typings.reactImgix.mod.Background.asInstanceOf[ComponentType[BackgroundProps[typings.reactImgix.mod.BackgroundProps]]]
  @scala.inline
  def Picture: ComponentType[PictureProps[CommonProps]] = js.constructorOf[typings.reactImgix.mod.Picture].asInstanceOf[ComponentType[PictureProps[CommonProps]]]
  @scala.inline
  def ReactImgix: ComponentType[ReactImgixProps] = js.constructorOf[default].asInstanceOf[ComponentType[ReactImgixProps]]
  @scala.inline
  def Source: ComponentType[SourceProps] = js.constructorOf[typings.reactImgix.mod.Source].asInstanceOf[ComponentType[SourceProps]]
}

