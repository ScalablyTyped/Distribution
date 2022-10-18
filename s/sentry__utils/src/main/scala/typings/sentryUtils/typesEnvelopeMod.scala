package typings.sentryUtils

import typings.sentryTypes.typesAttachmentMod.Attachment
import typings.sentryTypes.typesDatacategoryMod.DataCategory
import typings.sentryTypes.typesEnvelopeMod.AttachmentItem
import typings.sentryTypes.typesEnvelopeMod.Envelope
import typings.sentryTypes.typesEnvelopeMod.EnvelopeItemType
import typings.sentryTypes.typesTextencoderMod.TextEncoderInternal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesEnvelopeMod {
  
  @JSImport("@sentry/utils/types/envelope", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def addItemToEnvelope_1[E /* <: Envelope */](
    envelope: E,
    newItem: /* import warning: importer.ImportType#apply Failed type conversion: E[1][number] */ js.Any
  ): E = (^.asInstanceOf[js.Dynamic].applyDynamic("addItemToEnvelope")(envelope.asInstanceOf[js.Any], newItem.asInstanceOf[js.Any])).asInstanceOf[E]
  
  inline def createAttachmentEnvelopeItem(attachment: Attachment): AttachmentItem = ^.asInstanceOf[js.Dynamic].applyDynamic("createAttachmentEnvelopeItem")(attachment.asInstanceOf[js.Any]).asInstanceOf[AttachmentItem]
  inline def createAttachmentEnvelopeItem(attachment: Attachment, textEncoder: TextEncoderInternal): AttachmentItem = (^.asInstanceOf[js.Dynamic].applyDynamic("createAttachmentEnvelopeItem")(attachment.asInstanceOf[js.Any], textEncoder.asInstanceOf[js.Any])).asInstanceOf[AttachmentItem]
  
  inline def createEnvelope[E /* <: Envelope */](
    headers: /* import warning: importer.ImportType#apply Failed type conversion: E[0] */ js.Any,
    items: /* import warning: importer.ImportType#apply Failed type conversion: E[1] */ js.Any
  ): E = (^.asInstanceOf[js.Dynamic].applyDynamic("createEnvelope")(headers.asInstanceOf[js.Any], items.asInstanceOf[js.Any])).asInstanceOf[E]
  
  inline def createEnvelope_0[E /* <: Envelope */](headers: /* import warning: importer.ImportType#apply Failed type conversion: E[0] */ js.Any): E = ^.asInstanceOf[js.Dynamic].applyDynamic("createEnvelope")(headers.asInstanceOf[js.Any]).asInstanceOf[E]
  
  inline def envelopeItemTypeToDataCategory(`type`: EnvelopeItemType): DataCategory = ^.asInstanceOf[js.Dynamic].applyDynamic("envelopeItemTypeToDataCategory")(`type`.asInstanceOf[js.Any]).asInstanceOf[DataCategory]
  
  inline def forEachEnvelopeItem[E /* <: Envelope */](
    envelope: Envelope,
    callback: js.Function2[
      /* import warning: importer.ImportType#apply Failed type conversion: E[1][number] */ /* envelopeItem */ js.Any, 
      /* import warning: importer.ImportType#apply Failed type conversion: E[1][number][0]['type'] */ /* envelopeItemType */ js.Any, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("forEachEnvelopeItem")(envelope.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def serializeEnvelope(envelope: Envelope): String | js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("serializeEnvelope")(envelope.asInstanceOf[js.Any]).asInstanceOf[String | js.typedarray.Uint8Array]
  inline def serializeEnvelope(envelope: Envelope, textEncoder: TextEncoderInternal): String | js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("serializeEnvelope")(envelope.asInstanceOf[js.Any], textEncoder.asInstanceOf[js.Any])).asInstanceOf[String | js.typedarray.Uint8Array]
}
