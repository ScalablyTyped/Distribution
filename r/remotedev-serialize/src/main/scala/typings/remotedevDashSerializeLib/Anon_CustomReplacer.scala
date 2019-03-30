package typings
package remotedevDashSerializeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_CustomReplacer extends js.Object {
  def parse(input: java.lang.String): js.Any = js.native
  def serialize(immutable: Anon_CollectionCollections): Anon_Options = js.native
  def serialize(
    immutable: Anon_CollectionCollections,
    refs: remotedevDashSerializeLib.remotedevDashSerializeMod.Refs
  ): Anon_Options = js.native
  def serialize(
    immutable: Anon_CollectionCollections,
    refs: remotedevDashSerializeLib.remotedevDashSerializeMod.Refs,
    customReplacer: remotedevDashSerializeLib.remotedevDashSerializeMod.Replacer
  ): Anon_Options = js.native
  def serialize(
    immutable: Anon_CollectionCollections,
    refs: remotedevDashSerializeLib.remotedevDashSerializeMod.Refs,
    customReplacer: remotedevDashSerializeLib.remotedevDashSerializeMod.Replacer,
    customReviver: remotedevDashSerializeLib.remotedevDashSerializeMod.Reviver
  ): Anon_Options = js.native
  def stringify(input: js.Any): java.lang.String = js.native
}

