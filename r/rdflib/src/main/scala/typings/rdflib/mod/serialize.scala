package typings.rdflib.mod

import typings.rdflib.anon.Flags
import typings.rdflib.formulaMod.default
import typings.rdflib.typesMod.ContentType
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rdflib", "serialize")
@js.native
object serialize extends js.Object {
  def apply(/** The graph or nodes that should be serialized */
  target: default): js.UndefOr[String] = js.native
  def apply(
    /** The graph or nodes that should be serialized */
  target: default,
    /** The store */
  kb: typings.rdflib.storeMod.default
  ): js.UndefOr[String] = js.native
  def apply(
    /** The graph or nodes that should be serialized */
  target: default,
    /** The store */
  kb: typings.rdflib.storeMod.default,
    base: js.Any
  ): js.UndefOr[String] = js.native
  def apply(
    /** The graph or nodes that should be serialized */
  target: default,
    /** The store */
  kb: typings.rdflib.storeMod.default,
    base: js.Any,
    /**
    * The mime type.
    * Defaults to Turtle.
    */
  contentType: String
  ): js.UndefOr[String] = js.native
  def apply(
    /** The graph or nodes that should be serialized */
  target: default,
    /** The store */
  kb: typings.rdflib.storeMod.default,
    base: js.Any,
    /**
    * The mime type.
    * Defaults to Turtle.
    */
  contentType: String,
    callback: js.Function2[/* err */ js.UndefOr[Error | Null], /* result */ js.UndefOr[String | Null], _]
  ): js.UndefOr[String] = js.native
  def apply(
    /** The graph or nodes that should be serialized */
  target: default,
    /** The store */
  kb: typings.rdflib.storeMod.default,
    base: js.Any,
    /**
    * The mime type.
    * Defaults to Turtle.
    */
  contentType: String,
    callback: js.Function2[/* err */ js.UndefOr[Error | Null], /* result */ js.UndefOr[String | Null], _],
    options: Flags
  ): js.UndefOr[String] = js.native
  def apply(
    /** The graph or nodes that should be serialized */
  target: default,
    /** The store */
  kb: typings.rdflib.storeMod.default,
    base: js.Any,
    /**
    * The mime type.
    * Defaults to Turtle.
    */
  contentType: ContentType
  ): js.UndefOr[String] = js.native
  def apply(
    /** The graph or nodes that should be serialized */
  target: default,
    /** The store */
  kb: typings.rdflib.storeMod.default,
    base: js.Any,
    /**
    * The mime type.
    * Defaults to Turtle.
    */
  contentType: ContentType,
    callback: js.Function2[/* err */ js.UndefOr[Error | Null], /* result */ js.UndefOr[String | Null], _]
  ): js.UndefOr[String] = js.native
  def apply(
    /** The graph or nodes that should be serialized */
  target: default,
    /** The store */
  kb: typings.rdflib.storeMod.default,
    base: js.Any,
    /**
    * The mime type.
    * Defaults to Turtle.
    */
  contentType: ContentType,
    callback: js.Function2[/* err */ js.UndefOr[Error | Null], /* result */ js.UndefOr[String | Null], _],
    options: Flags
  ): js.UndefOr[String] = js.native
  def apply(/** The graph or nodes that should be serialized */
  target: typings.rdflib.tfTypesMod.BlankNode): js.UndefOr[String] = js.native
  def apply(
    /** The graph or nodes that should be serialized */
  target: typings.rdflib.tfTypesMod.BlankNode,
    /** The store */
  kb: typings.rdflib.storeMod.default
  ): js.UndefOr[String] = js.native
  def apply(
    /** The graph or nodes that should be serialized */
  target: typings.rdflib.tfTypesMod.BlankNode,
    /** The store */
  kb: typings.rdflib.storeMod.default,
    base: js.Any
  ): js.UndefOr[String] = js.native
  def apply(
    /** The graph or nodes that should be serialized */
  target: typings.rdflib.tfTypesMod.BlankNode,
    /** The store */
  kb: typings.rdflib.storeMod.default,
    base: js.Any,
    /**
    * The mime type.
    * Defaults to Turtle.
    */
  contentType: String
  ): js.UndefOr[String] = js.native
  def apply(
    /** The graph or nodes that should be serialized */
  target: typings.rdflib.tfTypesMod.BlankNode,
    /** The store */
  kb: typings.rdflib.storeMod.default,
    base: js.Any,
    /**
    * The mime type.
    * Defaults to Turtle.
    */
  contentType: String,
    callback: js.Function2[/* err */ js.UndefOr[Error | Null], /* result */ js.UndefOr[String | Null], _]
  ): js.UndefOr[String] = js.native
  def apply(
    /** The graph or nodes that should be serialized */
  target: typings.rdflib.tfTypesMod.BlankNode,
    /** The store */
  kb: typings.rdflib.storeMod.default,
    base: js.Any,
    /**
    * The mime type.
    * Defaults to Turtle.
    */
  contentType: String,
    callback: js.Function2[/* err */ js.UndefOr[Error | Null], /* result */ js.UndefOr[String | Null], _],
    options: Flags
  ): js.UndefOr[String] = js.native
  def apply(
    /** The graph or nodes that should be serialized */
  target: typings.rdflib.tfTypesMod.BlankNode,
    /** The store */
  kb: typings.rdflib.storeMod.default,
    base: js.Any,
    /**
    * The mime type.
    * Defaults to Turtle.
    */
  contentType: ContentType
  ): js.UndefOr[String] = js.native
  def apply(
    /** The graph or nodes that should be serialized */
  target: typings.rdflib.tfTypesMod.BlankNode,
    /** The store */
  kb: typings.rdflib.storeMod.default,
    base: js.Any,
    /**
    * The mime type.
    * Defaults to Turtle.
    */
  contentType: ContentType,
    callback: js.Function2[/* err */ js.UndefOr[Error | Null], /* result */ js.UndefOr[String | Null], _]
  ): js.UndefOr[String] = js.native
  def apply(
    /** The graph or nodes that should be serialized */
  target: typings.rdflib.tfTypesMod.BlankNode,
    /** The store */
  kb: typings.rdflib.storeMod.default,
    base: js.Any,
    /**
    * The mime type.
    * Defaults to Turtle.
    */
  contentType: ContentType,
    callback: js.Function2[/* err */ js.UndefOr[Error | Null], /* result */ js.UndefOr[String | Null], _],
    options: Flags
  ): js.UndefOr[String] = js.native
  def apply(/** The graph or nodes that should be serialized */
  target: typings.rdflib.tfTypesMod.NamedNode): js.UndefOr[String] = js.native
  def apply(
    /** The graph or nodes that should be serialized */
  target: typings.rdflib.tfTypesMod.NamedNode,
    /** The store */
  kb: typings.rdflib.storeMod.default
  ): js.UndefOr[String] = js.native
  def apply(
    /** The graph or nodes that should be serialized */
  target: typings.rdflib.tfTypesMod.NamedNode,
    /** The store */
  kb: typings.rdflib.storeMod.default,
    base: js.Any
  ): js.UndefOr[String] = js.native
  def apply(
    /** The graph or nodes that should be serialized */
  target: typings.rdflib.tfTypesMod.NamedNode,
    /** The store */
  kb: typings.rdflib.storeMod.default,
    base: js.Any,
    /**
    * The mime type.
    * Defaults to Turtle.
    */
  contentType: String
  ): js.UndefOr[String] = js.native
  def apply(
    /** The graph or nodes that should be serialized */
  target: typings.rdflib.tfTypesMod.NamedNode,
    /** The store */
  kb: typings.rdflib.storeMod.default,
    base: js.Any,
    /**
    * The mime type.
    * Defaults to Turtle.
    */
  contentType: String,
    callback: js.Function2[/* err */ js.UndefOr[Error | Null], /* result */ js.UndefOr[String | Null], _]
  ): js.UndefOr[String] = js.native
  def apply(
    /** The graph or nodes that should be serialized */
  target: typings.rdflib.tfTypesMod.NamedNode,
    /** The store */
  kb: typings.rdflib.storeMod.default,
    base: js.Any,
    /**
    * The mime type.
    * Defaults to Turtle.
    */
  contentType: String,
    callback: js.Function2[/* err */ js.UndefOr[Error | Null], /* result */ js.UndefOr[String | Null], _],
    options: Flags
  ): js.UndefOr[String] = js.native
  def apply(
    /** The graph or nodes that should be serialized */
  target: typings.rdflib.tfTypesMod.NamedNode,
    /** The store */
  kb: typings.rdflib.storeMod.default,
    base: js.Any,
    /**
    * The mime type.
    * Defaults to Turtle.
    */
  contentType: ContentType
  ): js.UndefOr[String] = js.native
  def apply(
    /** The graph or nodes that should be serialized */
  target: typings.rdflib.tfTypesMod.NamedNode,
    /** The store */
  kb: typings.rdflib.storeMod.default,
    base: js.Any,
    /**
    * The mime type.
    * Defaults to Turtle.
    */
  contentType: ContentType,
    callback: js.Function2[/* err */ js.UndefOr[Error | Null], /* result */ js.UndefOr[String | Null], _]
  ): js.UndefOr[String] = js.native
  def apply(
    /** The graph or nodes that should be serialized */
  target: typings.rdflib.tfTypesMod.NamedNode,
    /** The store */
  kb: typings.rdflib.storeMod.default,
    base: js.Any,
    /**
    * The mime type.
    * Defaults to Turtle.
    */
  contentType: ContentType,
    callback: js.Function2[/* err */ js.UndefOr[Error | Null], /* result */ js.UndefOr[String | Null], _],
    options: Flags
  ): js.UndefOr[String] = js.native
}

