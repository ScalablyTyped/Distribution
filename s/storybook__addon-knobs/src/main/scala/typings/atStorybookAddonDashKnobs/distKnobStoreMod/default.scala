package typings.atStorybookAddonDashKnobs.distKnobStoreMod

import typings.atStorybookAddonDashKnobs.Anon_CallbackDefaultValue
import typings.atStorybookAddonDashKnobs.Anon_CallbackDefaultValueGroupId
import typings.atStorybookAddonDashKnobs.atStorybookAddonDashKnobsStrings.value
import typings.atStorybookAddonDashKnobs.distComponentsTypesTypesMod.KnobControlConfig
import typings.std.Partial
import typings.std.Pick
import typings.std.Record
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
  override def get(key: String): (Anon_CallbackDefaultValue with (Pick[KnobControlConfig[_], value])) | Anon_CallbackDefaultValueGroupId = js.native
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

