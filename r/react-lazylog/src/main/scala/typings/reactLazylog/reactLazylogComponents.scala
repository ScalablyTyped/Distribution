package typings.reactLazylog

import typings.react.mod.ComponentType
import typings.reactLazylog.lazyLogMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object reactLazylogComponents extends reactLazylogProps {
  @scala.inline
  def LazyLog: ComponentType[LazyLogProps] = js.constructorOf[default].asInstanceOf[ComponentType[LazyLogProps]]
  @scala.inline
  def Line: ComponentType[LineProps] = js.constructorOf[typings.reactLazylog.lineMod.default].asInstanceOf[ComponentType[LineProps]]
  @scala.inline
  def LineContent: ComponentType[LineContentProps] = js.constructorOf[typings.reactLazylog.lineContentMod.default].asInstanceOf[ComponentType[LineContentProps]]
  @scala.inline
  def LineNumber: ComponentType[LineNumberProps] = js.constructorOf[typings.reactLazylog.lineNumberMod.default].asInstanceOf[ComponentType[LineNumberProps]]
  @scala.inline
  def LinePart: ComponentType[LinePartProps] = js.constructorOf[typings.reactLazylog.linePartMod.default].asInstanceOf[ComponentType[LinePartProps]]
  @scala.inline
  def Loading: ComponentType[js.Object] = js.constructorOf[typings.reactLazylog.loadingMod.default].asInstanceOf[ComponentType[js.Object]]
  @scala.inline
  def ScrollFollow: ComponentType[ScrollFollowProps] = js.constructorOf[typings.reactLazylog.scrollFollowMod.default].asInstanceOf[ComponentType[ScrollFollowProps]]
  @scala.inline
  def SearchBar: ComponentType[SearchBarProps] = js.constructorOf[typings.reactLazylog.searchBarMod.default].asInstanceOf[ComponentType[SearchBarProps]]
}

