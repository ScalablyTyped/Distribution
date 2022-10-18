package typings.reactNativeDocumentPicker

import typings.reactNativeDocumentPicker.libTypescriptFileTypesMod.SupportedPlatforms
import typings.reactNativeDocumentPicker.mod.DirectoryPickerResponse
import typings.reactNativeDocumentPicker.mod.DocumentPickerOptions
import typings.reactNativeDocumentPicker.mod.DocumentPickerResponse
import typings.reactNativeDocumentPicker.reactNativeDocumentPickerStrings.Asterisk
import typings.reactNativeDocumentPicker.reactNativeDocumentPickerStrings.AsteriskSlashAsterisk
import typings.reactNativeDocumentPicker.reactNativeDocumentPickerStrings.Dotcsv
import typings.reactNativeDocumentPicker.reactNativeDocumentPickerStrings.Dotdoc
import typings.reactNativeDocumentPicker.reactNativeDocumentPickerStrings.Dotdocx
import typings.reactNativeDocumentPicker.reactNativeDocumentPickerStrings.Dotmp4
import typings.reactNativeDocumentPicker.reactNativeDocumentPickerStrings.Dotpdf
import typings.reactNativeDocumentPicker.reactNativeDocumentPickerStrings.Dotppt
import typings.reactNativeDocumentPicker.reactNativeDocumentPickerStrings.Dotpptx
import typings.reactNativeDocumentPicker.reactNativeDocumentPickerStrings.Dottxt
import typings.reactNativeDocumentPicker.reactNativeDocumentPickerStrings.Dotxls
import typings.reactNativeDocumentPicker.reactNativeDocumentPickerStrings.Dotxlsx
import typings.reactNativeDocumentPicker.reactNativeDocumentPickerStrings.`Dotjpeg Dotjpg Dotpng`
import typings.reactNativeDocumentPicker.reactNativeDocumentPickerStrings.`Dotzip Dotgz`
import typings.reactNativeDocumentPicker.reactNativeDocumentPickerStrings.`applicationSlashvndDotms-excel`
import typings.reactNativeDocumentPicker.reactNativeDocumentPickerStrings.`applicationSlashvndDotms-powerpoint`
import typings.reactNativeDocumentPicker.reactNativeDocumentPickerStrings.`publicDotcomma-separated-values-text`
import typings.reactNativeDocumentPicker.reactNativeDocumentPickerStrings.`publicDotplain-text`
import typings.reactNativeDocumentPicker.reactNativeDocumentPickerStrings.`publicDotzip-archive`
import typings.reactNativeDocumentPicker.reactNativeDocumentPickerStrings.applicationSlashmsword
import typings.reactNativeDocumentPicker.reactNativeDocumentPickerStrings.applicationSlashpdf
import typings.reactNativeDocumentPicker.reactNativeDocumentPickerStrings.applicationSlashzip
import typings.reactNativeDocumentPicker.reactNativeDocumentPickerStrings.audioSlashAsterisk
import typings.reactNativeDocumentPicker.reactNativeDocumentPickerStrings.comDotadobeDotpdf
import typings.reactNativeDocumentPicker.reactNativeDocumentPickerStrings.comDotmicrosoftDotexcelDotxls
import typings.reactNativeDocumentPicker.reactNativeDocumentPickerStrings.comDotmicrosoftDotpowerpointDotppt
import typings.reactNativeDocumentPicker.reactNativeDocumentPickerStrings.comDotmicrosoftDotwordDotdoc
import typings.reactNativeDocumentPicker.reactNativeDocumentPickerStrings.imageSlashAsterisk
import typings.reactNativeDocumentPicker.reactNativeDocumentPickerStrings.orgDotopenxmlformatsDotpresentationmlDotpresentation
import typings.reactNativeDocumentPicker.reactNativeDocumentPickerStrings.orgDotopenxmlformatsDotspreadsheetmlDotsheet
import typings.reactNativeDocumentPicker.reactNativeDocumentPickerStrings.orgDotopenxmlformatsDotwordprocessingmlDotdocument
import typings.reactNativeDocumentPicker.reactNativeDocumentPickerStrings.presentationStyle
import typings.reactNativeDocumentPicker.reactNativeDocumentPickerStrings.publicDotaudio
import typings.reactNativeDocumentPicker.reactNativeDocumentPickerStrings.publicDotimage
import typings.reactNativeDocumentPicker.reactNativeDocumentPickerStrings.publicDotitem
import typings.reactNativeDocumentPicker.reactNativeDocumentPickerStrings.publicDotmovie
import typings.reactNativeDocumentPicker.reactNativeDocumentPickerStrings.textSlashcsv
import typings.reactNativeDocumentPicker.reactNativeDocumentPickerStrings.textSlashplain
import typings.reactNativeDocumentPicker.reactNativeDocumentPickerStrings.transitionStyle
import typings.reactNativeDocumentPicker.reactNativeDocumentPickerStrings.videoSlashAsterisk
import typings.std.Pick
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Android extends StObject {
    
    var android: ReadonlyreadonlyallFilesr
    
    var ios: ReadonlyreadonlyallFilesp
    
    var macos: ReadonlyreadonlyallFilesrAllFiles
    
    var web: ReadonlyreadonlyallFilesrAllFiles
    
    var windows: ReadonlyreadonlyallFilesrAllFiles
  }
  object Android {
    
    inline def apply(
      android: ReadonlyreadonlyallFilesr,
      ios: ReadonlyreadonlyallFilesp,
      macos: ReadonlyreadonlyallFilesrAllFiles,
      web: ReadonlyreadonlyallFilesrAllFiles,
      windows: ReadonlyreadonlyallFilesrAllFiles
    ): Android = {
      val __obj = js.Dynamic.literal(android = android.asInstanceOf[js.Any], ios = ios.asInstanceOf[js.Any], macos = macos.asInstanceOf[js.Any], web = web.asInstanceOf[js.Any], windows = windows.asInstanceOf[js.Any])
      __obj.asInstanceOf[Android]
    }
    
    extension [Self <: Android](x: Self) {
      
      inline def setAndroid(value: ReadonlyreadonlyallFilesr): Self = StObject.set(x, "android", value.asInstanceOf[js.Any])
      
      inline def setIos(value: ReadonlyreadonlyallFilesp): Self = StObject.set(x, "ios", value.asInstanceOf[js.Any])
      
      inline def setMacos(value: ReadonlyreadonlyallFilesrAllFiles): Self = StObject.set(x, "macos", value.asInstanceOf[js.Any])
      
      inline def setWeb(value: ReadonlyreadonlyallFilesrAllFiles): Self = StObject.set(x, "web", value.asInstanceOf[js.Any])
      
      inline def setWindows(value: ReadonlyreadonlyallFilesrAllFiles): Self = StObject.set(x, "windows", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Fn0 extends StObject {
    
    def apply[OS /* <: SupportedPlatforms */](): js.Promise[DocumentPickerResponse] = js.native
    def apply[OS /* <: SupportedPlatforms */](opts: DocumentPickerOptions[OS]): js.Promise[DocumentPickerResponse] = js.native
  }
  
  @js.native
  trait FnCall extends StObject {
    
    def apply[OS /* <: SupportedPlatforms */](): js.Promise[DirectoryPickerResponse | Null] = js.native
    def apply[OS /* <: SupportedPlatforms */](params: Pick[DocumentPickerOptions[OS], presentationStyle | transitionStyle]): js.Promise[DirectoryPickerResponse | Null] = js.native
  }
  
  @js.native
  trait FnCallOpts extends StObject {
    
    def apply[OS /* <: SupportedPlatforms */](): js.Promise[js.Array[DocumentPickerResponse]] = js.native
    def apply[OS /* <: SupportedPlatforms */](opts: DocumentPickerOptions[OS]): js.Promise[js.Array[DocumentPickerResponse]] = js.native
  }
  
  /* Inlined std.Readonly<{ readonly allFiles :'public.item',  readonly audio :'public.audio',  readonly csv :'public.comma-separated-values-text',  readonly doc :'com.microsoft.word.doc',  readonly docx :'org.openxmlformats.wordprocessingml.document',  readonly images :'public.image',  readonly pdf :'com.adobe.pdf',  readonly plainText :'public.plain-text',  readonly ppt :'com.microsoft.powerpoint.ppt',  readonly pptx :'org.openxmlformats.presentationml.presentation',  readonly video :'public.movie',  readonly xls :'com.microsoft.excel.xls',  readonly xlsx :'org.openxmlformats.spreadsheetml.sheet',  readonly zip :'public.zip-archive'}> */
  trait ReadonlyreadonlyallFilesp extends StObject {
    
    val allFiles: publicDotitem
    
    val audio: publicDotaudio
    
    val csv: `publicDotcomma-separated-values-text`
    
    val doc: comDotmicrosoftDotwordDotdoc
    
    val docx: orgDotopenxmlformatsDotwordprocessingmlDotdocument
    
    val images: publicDotimage
    
    val pdf: comDotadobeDotpdf
    
    val plainText: `publicDotplain-text`
    
    val ppt: comDotmicrosoftDotpowerpointDotppt
    
    val pptx: orgDotopenxmlformatsDotpresentationmlDotpresentation
    
    val video: publicDotmovie
    
    val xls: comDotmicrosoftDotexcelDotxls
    
    val xlsx: orgDotopenxmlformatsDotspreadsheetmlDotsheet
    
    val zip: `publicDotzip-archive`
  }
  object ReadonlyreadonlyallFilesp {
    
    inline def apply(): ReadonlyreadonlyallFilesp = {
      val __obj = js.Dynamic.literal(allFiles = "public.item", audio = "public.audio", csv = "public.comma-separated-values-text", doc = "com.microsoft.word.doc", docx = "org.openxmlformats.wordprocessingml.document", images = "public.image", pdf = "com.adobe.pdf", plainText = "public.plain-text", ppt = "com.microsoft.powerpoint.ppt", pptx = "org.openxmlformats.presentationml.presentation", video = "public.movie", xls = "com.microsoft.excel.xls", xlsx = "org.openxmlformats.spreadsheetml.sheet", zip = "public.zip-archive")
      __obj.asInstanceOf[ReadonlyreadonlyallFilesp]
    }
    
    extension [Self <: ReadonlyreadonlyallFilesp](x: Self) {
      
      inline def setAllFiles(value: publicDotitem): Self = StObject.set(x, "allFiles", value.asInstanceOf[js.Any])
      
      inline def setAudio(value: publicDotaudio): Self = StObject.set(x, "audio", value.asInstanceOf[js.Any])
      
      inline def setCsv(value: `publicDotcomma-separated-values-text`): Self = StObject.set(x, "csv", value.asInstanceOf[js.Any])
      
      inline def setDoc(value: comDotmicrosoftDotwordDotdoc): Self = StObject.set(x, "doc", value.asInstanceOf[js.Any])
      
      inline def setDocx(value: orgDotopenxmlformatsDotwordprocessingmlDotdocument): Self = StObject.set(x, "docx", value.asInstanceOf[js.Any])
      
      inline def setImages(value: publicDotimage): Self = StObject.set(x, "images", value.asInstanceOf[js.Any])
      
      inline def setPdf(value: comDotadobeDotpdf): Self = StObject.set(x, "pdf", value.asInstanceOf[js.Any])
      
      inline def setPlainText(value: `publicDotplain-text`): Self = StObject.set(x, "plainText", value.asInstanceOf[js.Any])
      
      inline def setPpt(value: comDotmicrosoftDotpowerpointDotppt): Self = StObject.set(x, "ppt", value.asInstanceOf[js.Any])
      
      inline def setPptx(value: orgDotopenxmlformatsDotpresentationmlDotpresentation): Self = StObject.set(x, "pptx", value.asInstanceOf[js.Any])
      
      inline def setVideo(value: publicDotmovie): Self = StObject.set(x, "video", value.asInstanceOf[js.Any])
      
      inline def setXls(value: comDotmicrosoftDotexcelDotxls): Self = StObject.set(x, "xls", value.asInstanceOf[js.Any])
      
      inline def setXlsx(value: orgDotopenxmlformatsDotspreadsheetmlDotsheet): Self = StObject.set(x, "xlsx", value.asInstanceOf[js.Any])
      
      inline def setZip(value: `publicDotzip-archive`): Self = StObject.set(x, "zip", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Readonly<{ readonly allFiles :'* / *',  readonly audio :'audio/ *',  readonly csv :'text/csv',  readonly doc :'application/msword',  readonly docx :'application/vnd.openxmlformats-officedocument.wordprocessingml.document',  readonly images :'image/ *',  readonly pdf :'application/pdf',  readonly plainText :'text/plain',  readonly ppt :'application/vnd.ms-powerpoint',  readonly pptx :'application/vnd.openxmlformats-officedocument.presentationml.presentation',  readonly video :'video/ *',  readonly xls :'application/vnd.ms-excel',  readonly xlsx :'application/vnd.openxmlformats-officedocument.spreadsheetml.sheet',  readonly zip :'application/zip'}> */
  trait ReadonlyreadonlyallFilesr extends StObject {
    
    val allFiles: AsteriskSlashAsterisk
    
    val audio: audioSlashAsterisk
    
    val csv: textSlashcsv
    
    val doc: applicationSlashmsword
    
    val docx: /* application/vnd.openxmlformats-officedocument.wordprocessingml.document */ String
    
    val images: imageSlashAsterisk
    
    val pdf: applicationSlashpdf
    
    val plainText: textSlashplain
    
    val ppt: `applicationSlashvndDotms-powerpoint`
    
    val pptx: /* application/vnd.openxmlformats-officedocument.presentationml.presentation */ String
    
    val video: videoSlashAsterisk
    
    val xls: `applicationSlashvndDotms-excel`
    
    val xlsx: /* application/vnd.openxmlformats-officedocument.spreadsheetml.sheet */ String
    
    val zip: applicationSlashzip
  }
  object ReadonlyreadonlyallFilesr {
    
    inline def apply(): ReadonlyreadonlyallFilesr = {
      val __obj = js.Dynamic.literal(allFiles = "*/*", audio = "audio/*", csv = "text/csv", doc = "application/msword", docx = "application/vnd.openxmlformats-officedocument.wordprocessingml.document", images = "image/*", pdf = "application/pdf", plainText = "text/plain", ppt = "application/vnd.ms-powerpoint", pptx = "application/vnd.openxmlformats-officedocument.presentationml.presentation", video = "video/*", xls = "application/vnd.ms-excel", xlsx = "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet", zip = "application/zip")
      __obj.asInstanceOf[ReadonlyreadonlyallFilesr]
    }
    
    extension [Self <: ReadonlyreadonlyallFilesr](x: Self) {
      
      inline def setAllFiles(value: AsteriskSlashAsterisk): Self = StObject.set(x, "allFiles", value.asInstanceOf[js.Any])
      
      inline def setAudio(value: audioSlashAsterisk): Self = StObject.set(x, "audio", value.asInstanceOf[js.Any])
      
      inline def setCsv(value: textSlashcsv): Self = StObject.set(x, "csv", value.asInstanceOf[js.Any])
      
      inline def setDoc(value: applicationSlashmsword): Self = StObject.set(x, "doc", value.asInstanceOf[js.Any])
      
      inline def setDocx(value: /* application/vnd.openxmlformats-officedocument.wordprocessingml.document */ String): Self = StObject.set(x, "docx", value.asInstanceOf[js.Any])
      
      inline def setImages(value: imageSlashAsterisk): Self = StObject.set(x, "images", value.asInstanceOf[js.Any])
      
      inline def setPdf(value: applicationSlashpdf): Self = StObject.set(x, "pdf", value.asInstanceOf[js.Any])
      
      inline def setPlainText(value: textSlashplain): Self = StObject.set(x, "plainText", value.asInstanceOf[js.Any])
      
      inline def setPpt(value: `applicationSlashvndDotms-powerpoint`): Self = StObject.set(x, "ppt", value.asInstanceOf[js.Any])
      
      inline def setPptx(value: /* application/vnd.openxmlformats-officedocument.presentationml.presentation */ String): Self = StObject.set(x, "pptx", value.asInstanceOf[js.Any])
      
      inline def setVideo(value: videoSlashAsterisk): Self = StObject.set(x, "video", value.asInstanceOf[js.Any])
      
      inline def setXls(value: `applicationSlashvndDotms-excel`): Self = StObject.set(x, "xls", value.asInstanceOf[js.Any])
      
      inline def setXlsx(value: /* application/vnd.openxmlformats-officedocument.spreadsheetml.sheet */ String): Self = StObject.set(x, "xlsx", value.asInstanceOf[js.Any])
      
      inline def setZip(value: applicationSlashzip): Self = StObject.set(x, "zip", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Readonly<{ readonly allFiles :'*',  readonly audio :'.3g2 .3gp .aac .adt .adts .aif .aifc .aiff .asf .au .m3u .m4a .m4b .mid .midi .mp2 .mp3 .mp4 .rmi .snd .wav .wax .wma',  readonly csv :'.csv',  readonly doc :'.doc',  readonly docx :'.docx',  readonly images :'.jpeg .jpg .png',  readonly pdf :'.pdf',  readonly plainText :'.txt',  readonly ppt :'.ppt',  readonly pptx :'.pptx',  readonly video :'.mp4',  readonly xls :'.xls',  readonly xlsx :'.xlsx',  readonly zip :'.zip .gz'}> */
  trait ReadonlyreadonlyallFilesrAllFiles extends StObject {
    
    val allFiles: Asterisk
    
    val audio: /* .3g2 .3gp .aac .adt .adts .aif .aifc .aiff .asf .au .m3u .m4a .m4b .mid .midi .mp2 .mp3 .mp4 .rmi .snd .wav .wax .wma */ String
    
    val csv: Dotcsv
    
    val doc: Dotdoc
    
    val docx: Dotdocx
    
    val images: `Dotjpeg Dotjpg Dotpng`
    
    val pdf: Dotpdf
    
    val plainText: Dottxt
    
    val ppt: Dotppt
    
    val pptx: Dotpptx
    
    val video: Dotmp4
    
    val xls: Dotxls
    
    val xlsx: Dotxlsx
    
    val zip: `Dotzip Dotgz`
  }
  object ReadonlyreadonlyallFilesrAllFiles {
    
    inline def apply(): ReadonlyreadonlyallFilesrAllFiles = {
      val __obj = js.Dynamic.literal(allFiles = "*", audio = ".3g2 .3gp .aac .adt .adts .aif .aifc .aiff .asf .au .m3u .m4a .m4b .mid .midi .mp2 .mp3 .mp4 .rmi .snd .wav .wax .wma", csv = ".csv", doc = ".doc", docx = ".docx", images = ".jpeg .jpg .png", pdf = ".pdf", plainText = ".txt", ppt = ".ppt", pptx = ".pptx", video = ".mp4", xls = ".xls", xlsx = ".xlsx", zip = ".zip .gz")
      __obj.asInstanceOf[ReadonlyreadonlyallFilesrAllFiles]
    }
    
    extension [Self <: ReadonlyreadonlyallFilesrAllFiles](x: Self) {
      
      inline def setAllFiles(value: Asterisk): Self = StObject.set(x, "allFiles", value.asInstanceOf[js.Any])
      
      inline def setAudio(
        value: /* .3g2 .3gp .aac .adt .adts .aif .aifc .aiff .asf .au .m3u .m4a .m4b .mid .midi .mp2 .mp3 .mp4 .rmi .snd .wav .wax .wma */ String
      ): Self = StObject.set(x, "audio", value.asInstanceOf[js.Any])
      
      inline def setCsv(value: Dotcsv): Self = StObject.set(x, "csv", value.asInstanceOf[js.Any])
      
      inline def setDoc(value: Dotdoc): Self = StObject.set(x, "doc", value.asInstanceOf[js.Any])
      
      inline def setDocx(value: Dotdocx): Self = StObject.set(x, "docx", value.asInstanceOf[js.Any])
      
      inline def setImages(value: `Dotjpeg Dotjpg Dotpng`): Self = StObject.set(x, "images", value.asInstanceOf[js.Any])
      
      inline def setPdf(value: Dotpdf): Self = StObject.set(x, "pdf", value.asInstanceOf[js.Any])
      
      inline def setPlainText(value: Dottxt): Self = StObject.set(x, "plainText", value.asInstanceOf[js.Any])
      
      inline def setPpt(value: Dotppt): Self = StObject.set(x, "ppt", value.asInstanceOf[js.Any])
      
      inline def setPptx(value: Dotpptx): Self = StObject.set(x, "pptx", value.asInstanceOf[js.Any])
      
      inline def setVideo(value: Dotmp4): Self = StObject.set(x, "video", value.asInstanceOf[js.Any])
      
      inline def setXls(value: Dotxls): Self = StObject.set(x, "xls", value.asInstanceOf[js.Any])
      
      inline def setXlsx(value: Dotxlsx): Self = StObject.set(x, "xlsx", value.asInstanceOf[js.Any])
      
      inline def setZip(value: `Dotzip Dotgz`): Self = StObject.set(x, "zip", value.asInstanceOf[js.Any])
    }
  }
}
