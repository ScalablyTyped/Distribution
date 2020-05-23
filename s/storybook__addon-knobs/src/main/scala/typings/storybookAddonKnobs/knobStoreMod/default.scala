package typings.storybookAddonKnobs.knobStoreMod

import typings.std.Partial
import typings.std.Record
import typings.storybookAddonKnobs.anon.DefaultValue
import typings.storybookAddonKnobs.anon.typeanygroupIdstringundef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@storybook/addon-knobs/dist/KnobStore", JSImport.Default)
@js.native
class default () extends KnobStore {
  /* CompleteClass */
  override var callbacks: js.Array[Callback] = js.native
  /* CompleteClass */
  override var store: Record[String, KnobStoreKnob] = js.native
  /* CompleteClass */
  override def get(key: String): typeanygroupIdstringundef | DefaultValue = js.native
  /* CompleteClass */
  override def getAll(): Record[String, KnobStoreKnob] = js.native
  /* CompleteClass */
  override def has(key: String): Boolean = js.native
  /* CompleteClass */
  override def markAllUnused(): Unit = js.native
  /* CompleteClass */
  override def reset(): Unit = js.native
  /* CompleteClass */
  override def set(key: String, value: KnobStoreKnob): Unit = js.native
  /* CompleteClass */
  override def subscribe(cb: Callback): Unit = js.native
  /* CompleteClass */
  override def unsubscribe(cb: Callback): Unit = js.native
  /* CompleteClass */
  override def update(key: String, options: Partial[KnobStoreKnob]): Unit = js.native
}

