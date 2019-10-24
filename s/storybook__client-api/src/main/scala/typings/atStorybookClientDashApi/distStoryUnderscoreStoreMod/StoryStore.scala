package typings.atStorybookClientDashApi.distStoryUnderscoreStoreMod

import typings.atStorybookChannels.atStorybookChannelsMod.Channel
import typings.atStorybookClientDashApi.Anon_ApplyDecorators
import typings.atStorybookClientDashApi.Anon_Kind
import typings.atStorybookClientDashApi.Anon_KindStories
import typings.atStorybookClientDashApi.Anon_Parameters
import typings.atStorybookClientDashApi.distTypesMod.AddStoryArgs
import typings.atStorybookClientDashApi.distTypesMod.ErrorLike
import typings.atStorybookClientDashApi.distTypesMod.LegacyData
import typings.atStorybookClientDashApi.distTypesMod.StoreData
import typings.atStorybookClientDashApi.distTypesMod.StoreItem
import typings.eventemitter3.eventemitter3Mod.^
import typings.lodash.lodashMod.Cancelable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StoryStore
  extends ^[String | js.Symbol] {
  var _channel: Channel = js.native
  var _data: StoreData = js.native
  var _error: js.UndefOr[ErrorLike] = js.native
  var _legacyData: js.UndefOr[LegacyData] = js.native
  var _legacydata: LegacyData = js.native
  var _revision: Double = js.native
  var _selection: Selection = js.native
  var pushToManager: js.Function0[Unit] with Cancelable = js.native
  def addLegacyStory(hasKindNameStoryFnParameters: Anon_Kind): Unit = js.native
  def addStory(
    hasIdKindNameStoryFnParameters: AddStoryArgs,
    hasGetDecoratorsApplyDecorators: Anon_ApplyDecorators
  ): Unit = js.native
  def clean(): Unit = js.native
  def cleanHooks(id: String): Unit = js.native
  def cleanHooksForKind(kind: String): Unit = js.native
  def dumpStoryBook(): js.Array[Anon_KindStories] = js.native
  def extract(): js.Object = js.native
  def extract(options: StoryOptions): js.Object = js.native
  def fromId(id: String): StoreItem = js.native
  def getError(): ErrorLike = js.native
  def getRevision(): Double = js.native
  def getSelection(): Selection = js.native
  def getStories(kind: String): js.Array[_] = js.native
  def getStoriesForKind(kind: String): js.Array[StoreItem] = js.native
  def getStory(kind: String, name: String): js.Any = js.native
  def getStoryAndParameters(kind: String, name: String): Anon_Parameters = js.native
  def getStoryFileName(kind: String): String = js.native
  def getStoryKinds(): js.Array[String] = js.native
  def getStoryWithContext(kind: String, name: String): js.Any = js.native
  def hasStory(kind: String, name: String): Boolean = js.native
  def hasStoryKind(kind: String): Boolean = js.native
  def incrementRevision(): Unit = js.native
  def raw(): js.Array[StoreItem] = js.native
  def raw(options: StoryOptions): js.Array[StoreItem] = js.native
  def remove(id: String): Unit = js.native
  def removeStoryKind(kind: String): Unit = js.native
  def setChannel(channel: Channel): Unit = js.native
  def setSelection(data: js.UndefOr[scala.Nothing], error: ErrorLike): Unit = js.native
  def setSelection(data: Selection, error: ErrorLike): Unit = js.native
  def size(): Double = js.native
}

