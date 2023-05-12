package typings.sigstoreProtobufSpecs.`dist@GeneratedGoogleProtobufDescriptorMod`

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MessageOptions extends StObject {
  
  /**
    * Is this message deprecated?
    * Depending on the target platform, this can emit Deprecated annotations
    * for the message, or it will be completely ignored; in the very least,
    * this is a formalization for deprecating messages.
    */
  var deprecated: Boolean
  
  /**
    * Whether the message is an automatically generated map entry type for the
    * maps field.
    *
    * For maps fields:
    *     map<KeyType, ValueType> map_field = 1;
    * The parsed descriptor looks like:
    *     message MapFieldEntry {
    *         option map_entry = true;
    *         optional KeyType key = 1;
    *         optional ValueType value = 2;
    *     }
    *     repeated MapFieldEntry map_field = 1;
    *
    * Implementations may choose not to generate the map_entry=true message, but
    * use a native map in the target language to hold the keys and values.
    * The reflection APIs in such implementations still need to work as
    * if the field is a repeated message field.
    *
    * NOTE: Do not set the option in .proto files. Always use the maps syntax
    * instead. The option should only be implicitly set by the proto compiler
    * parser.
    */
  var mapEntry: Boolean
  
  /**
    * Set true to use the old proto1 MessageSet wire format for extensions.
    * This is provided for backwards-compatibility with the MessageSet wire
    * format.  You should not use this for any other reason:  It's less
    * efficient, has fewer features, and is more complicated.
    *
    * The message must be defined exactly as follows:
    *   message Foo {
    *     option message_set_wire_format = true;
    *     extensions 4 to max;
    *   }
    * Note that the message cannot have any defined fields; MessageSets only
    * have extensions.
    *
    * All extensions of your type must be singular messages; e.g. they cannot
    * be int32s, enums, or repeated messages.
    *
    * Because this is an option, the above two restrictions are not enforced by
    * the protocol compiler.
    */
  var messageSetWireFormat: Boolean
  
  /**
    * Disables the generation of the standard "descriptor()" accessor, which can
    * conflict with a field of the same name.  This is meant to make migration
    * from proto1 easier; new code should avoid fields named "descriptor".
    */
  var noStandardDescriptorAccessor: Boolean
  
  /** The parser stores options it doesn't recognize here. See above. */
  var uninterpretedOption: js.Array[UninterpretedOption]
}
object MessageOptions {
  
  inline def apply(
    deprecated: Boolean,
    mapEntry: Boolean,
    messageSetWireFormat: Boolean,
    noStandardDescriptorAccessor: Boolean,
    uninterpretedOption: js.Array[UninterpretedOption]
  ): MessageOptions = {
    val __obj = js.Dynamic.literal(deprecated = deprecated.asInstanceOf[js.Any], mapEntry = mapEntry.asInstanceOf[js.Any], messageSetWireFormat = messageSetWireFormat.asInstanceOf[js.Any], noStandardDescriptorAccessor = noStandardDescriptorAccessor.asInstanceOf[js.Any], uninterpretedOption = uninterpretedOption.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageOptions]
  }
  
  @JSImport("@sigstore/protobuf-specs/dist/@/generated/google/protobuf/descriptor", "MessageOptions")
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromJSON(`object`: Any): MessageOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(`object`.asInstanceOf[js.Any]).asInstanceOf[MessageOptions]
  
  inline def toJSON(message: MessageOptions): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("toJSON")(message.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MessageOptions] (val x: Self) extends AnyVal {
    
    inline def setDeprecated(value: Boolean): Self = StObject.set(x, "deprecated", value.asInstanceOf[js.Any])
    
    inline def setMapEntry(value: Boolean): Self = StObject.set(x, "mapEntry", value.asInstanceOf[js.Any])
    
    inline def setMessageSetWireFormat(value: Boolean): Self = StObject.set(x, "messageSetWireFormat", value.asInstanceOf[js.Any])
    
    inline def setNoStandardDescriptorAccessor(value: Boolean): Self = StObject.set(x, "noStandardDescriptorAccessor", value.asInstanceOf[js.Any])
    
    inline def setUninterpretedOption(value: js.Array[UninterpretedOption]): Self = StObject.set(x, "uninterpretedOption", value.asInstanceOf[js.Any])
    
    inline def setUninterpretedOptionVarargs(value: UninterpretedOption*): Self = StObject.set(x, "uninterpretedOption", js.Array(value*))
  }
}
