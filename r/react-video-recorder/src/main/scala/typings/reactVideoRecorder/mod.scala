package typings.reactVideoRecorder

import typings.react.mod.FunctionComponent
import typings.react.mod.ReactElement
import typings.reactVideoRecorder.anon.Audio
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-video-recorder", "ReactVideoRecorder")
  @js.native
  val ReactVideoRecorder: FunctionComponent[ReactVideoRecorderProps] = js.native
  
  trait ReactVideoRecorderProps extends StObject {
    
    var chunkSize: js.UndefOr[Double] = js.undefined
    
    /** Use this if you want to customize the constraints passed to getUserMedia() */
    var constraints: js.UndefOr[Audio] = js.undefined
    
    /** How much time to wait until it starts recording (in ms) */
    var countdownTime: js.UndefOr[Double] = js.undefined
    
    var dataAvailableTimeout: js.UndefOr[Double] = js.undefined
    
    /** Whether or not to display the video flipped (makes sense for user facing camera) */
    var isFlipped: js.UndefOr[Boolean] = js.undefined
    
    /** Whether or not to start the camera initially */
    var isOnInitially: js.UndefOr[Boolean] = js.undefined
    
    /** Pass this if you want to force a specific mime-type for the video */
    var mimeType: js.UndefOr[VideoRecorderMimeTypes] = js.undefined
    
    var onCameraOn: js.UndefOr[js.Function0[Any]] = js.undefined
    
    var onError: js.UndefOr[js.Function1[/* error */ js.Error, Any]] = js.undefined
    
    var onOpenVideoInput: js.UndefOr[js.Function0[Any]] = js.undefined
    
    var onPauseRecording: js.UndefOr[js.Function0[Any]] = js.undefined
    
    var onRecordingComplete: js.UndefOr[js.Function1[/* videoBlob */ Any, Unit]] = js.undefined
    
    var onResumeRecording: js.UndefOr[js.Function0[Any]] = js.undefined
    
    var onStartRecording: js.UndefOr[js.Function0[Any]] = js.undefined
    
    var onStopRecording: js.UndefOr[js.Function0[Any]] = js.undefined
    
    var onStopReplaying: js.UndefOr[js.Function0[Any]] = js.undefined
    
    var onTurnOffCamera: js.UndefOr[js.Function0[Any]] = js.undefined
    
    var onTurnOnCamera: js.UndefOr[js.Function0[Any]] = js.undefined
    
    var renderActions: js.UndefOr[js.Function1[/* props */ VideoActionsProps, ReactElement]] = js.undefined
    
    var renderDisconnectedView: js.UndefOr[js.Function1[/* props */ Any, ReactElement]] = js.undefined
    
    var renderErrorView: js.UndefOr[js.Function1[/* props */ Any, ReactElement]] = js.undefined
    
    var renderLoadingView: js.UndefOr[js.Function1[/* props */ Any, ReactElement]] = js.undefined
    
    var renderUnsupportedView: js.UndefOr[js.Function1[/* props */ Any, ReactElement]] = js.undefined
    
    var renderVideoInputView: js.UndefOr[js.Function1[/* props */ Any, ReactElement]] = js.undefined
    
    /** Use this to turn off autoplay and looping of the replay video. It is recommended to also showReplayControls in order to play */
    var replayVideoAutoplayAndLoopOff: js.UndefOr[Boolean] = js.undefined
    
    /** Use this if you want to show play/pause/etc. controls on the replay video */
    var showReplayControls: js.UndefOr[Boolean] = js.undefined
    
    /** Use this if you want to set a time limit for the video (in ms) */
    var timeLimit: js.UndefOr[Double] = js.undefined
    
    var useVideoInput: js.UndefOr[Boolean] = js.undefined
  }
  object ReactVideoRecorderProps {
    
    inline def apply(): ReactVideoRecorderProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReactVideoRecorderProps]
    }
    
    extension [Self <: ReactVideoRecorderProps](x: Self) {
      
      inline def setChunkSize(value: Double): Self = StObject.set(x, "chunkSize", value.asInstanceOf[js.Any])
      
      inline def setChunkSizeUndefined: Self = StObject.set(x, "chunkSize", js.undefined)
      
      inline def setConstraints(value: Audio): Self = StObject.set(x, "constraints", value.asInstanceOf[js.Any])
      
      inline def setConstraintsUndefined: Self = StObject.set(x, "constraints", js.undefined)
      
      inline def setCountdownTime(value: Double): Self = StObject.set(x, "countdownTime", value.asInstanceOf[js.Any])
      
      inline def setCountdownTimeUndefined: Self = StObject.set(x, "countdownTime", js.undefined)
      
      inline def setDataAvailableTimeout(value: Double): Self = StObject.set(x, "dataAvailableTimeout", value.asInstanceOf[js.Any])
      
      inline def setDataAvailableTimeoutUndefined: Self = StObject.set(x, "dataAvailableTimeout", js.undefined)
      
      inline def setIsFlipped(value: Boolean): Self = StObject.set(x, "isFlipped", value.asInstanceOf[js.Any])
      
      inline def setIsFlippedUndefined: Self = StObject.set(x, "isFlipped", js.undefined)
      
      inline def setIsOnInitially(value: Boolean): Self = StObject.set(x, "isOnInitially", value.asInstanceOf[js.Any])
      
      inline def setIsOnInitiallyUndefined: Self = StObject.set(x, "isOnInitially", js.undefined)
      
      inline def setMimeType(value: VideoRecorderMimeTypes): Self = StObject.set(x, "mimeType", value.asInstanceOf[js.Any])
      
      inline def setMimeTypeUndefined: Self = StObject.set(x, "mimeType", js.undefined)
      
      inline def setOnCameraOn(value: () => Any): Self = StObject.set(x, "onCameraOn", js.Any.fromFunction0(value))
      
      inline def setOnCameraOnUndefined: Self = StObject.set(x, "onCameraOn", js.undefined)
      
      inline def setOnError(value: /* error */ js.Error => Any): Self = StObject.set(x, "onError", js.Any.fromFunction1(value))
      
      inline def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
      
      inline def setOnOpenVideoInput(value: () => Any): Self = StObject.set(x, "onOpenVideoInput", js.Any.fromFunction0(value))
      
      inline def setOnOpenVideoInputUndefined: Self = StObject.set(x, "onOpenVideoInput", js.undefined)
      
      inline def setOnPauseRecording(value: () => Any): Self = StObject.set(x, "onPauseRecording", js.Any.fromFunction0(value))
      
      inline def setOnPauseRecordingUndefined: Self = StObject.set(x, "onPauseRecording", js.undefined)
      
      inline def setOnRecordingComplete(value: /* videoBlob */ Any => Unit): Self = StObject.set(x, "onRecordingComplete", js.Any.fromFunction1(value))
      
      inline def setOnRecordingCompleteUndefined: Self = StObject.set(x, "onRecordingComplete", js.undefined)
      
      inline def setOnResumeRecording(value: () => Any): Self = StObject.set(x, "onResumeRecording", js.Any.fromFunction0(value))
      
      inline def setOnResumeRecordingUndefined: Self = StObject.set(x, "onResumeRecording", js.undefined)
      
      inline def setOnStartRecording(value: () => Any): Self = StObject.set(x, "onStartRecording", js.Any.fromFunction0(value))
      
      inline def setOnStartRecordingUndefined: Self = StObject.set(x, "onStartRecording", js.undefined)
      
      inline def setOnStopRecording(value: () => Any): Self = StObject.set(x, "onStopRecording", js.Any.fromFunction0(value))
      
      inline def setOnStopRecordingUndefined: Self = StObject.set(x, "onStopRecording", js.undefined)
      
      inline def setOnStopReplaying(value: () => Any): Self = StObject.set(x, "onStopReplaying", js.Any.fromFunction0(value))
      
      inline def setOnStopReplayingUndefined: Self = StObject.set(x, "onStopReplaying", js.undefined)
      
      inline def setOnTurnOffCamera(value: () => Any): Self = StObject.set(x, "onTurnOffCamera", js.Any.fromFunction0(value))
      
      inline def setOnTurnOffCameraUndefined: Self = StObject.set(x, "onTurnOffCamera", js.undefined)
      
      inline def setOnTurnOnCamera(value: () => Any): Self = StObject.set(x, "onTurnOnCamera", js.Any.fromFunction0(value))
      
      inline def setOnTurnOnCameraUndefined: Self = StObject.set(x, "onTurnOnCamera", js.undefined)
      
      inline def setRenderActions(value: /* props */ VideoActionsProps => ReactElement): Self = StObject.set(x, "renderActions", js.Any.fromFunction1(value))
      
      inline def setRenderActionsUndefined: Self = StObject.set(x, "renderActions", js.undefined)
      
      inline def setRenderDisconnectedView(value: /* props */ Any => ReactElement): Self = StObject.set(x, "renderDisconnectedView", js.Any.fromFunction1(value))
      
      inline def setRenderDisconnectedViewUndefined: Self = StObject.set(x, "renderDisconnectedView", js.undefined)
      
      inline def setRenderErrorView(value: /* props */ Any => ReactElement): Self = StObject.set(x, "renderErrorView", js.Any.fromFunction1(value))
      
      inline def setRenderErrorViewUndefined: Self = StObject.set(x, "renderErrorView", js.undefined)
      
      inline def setRenderLoadingView(value: /* props */ Any => ReactElement): Self = StObject.set(x, "renderLoadingView", js.Any.fromFunction1(value))
      
      inline def setRenderLoadingViewUndefined: Self = StObject.set(x, "renderLoadingView", js.undefined)
      
      inline def setRenderUnsupportedView(value: /* props */ Any => ReactElement): Self = StObject.set(x, "renderUnsupportedView", js.Any.fromFunction1(value))
      
      inline def setRenderUnsupportedViewUndefined: Self = StObject.set(x, "renderUnsupportedView", js.undefined)
      
      inline def setRenderVideoInputView(value: /* props */ Any => ReactElement): Self = StObject.set(x, "renderVideoInputView", js.Any.fromFunction1(value))
      
      inline def setRenderVideoInputViewUndefined: Self = StObject.set(x, "renderVideoInputView", js.undefined)
      
      inline def setReplayVideoAutoplayAndLoopOff(value: Boolean): Self = StObject.set(x, "replayVideoAutoplayAndLoopOff", value.asInstanceOf[js.Any])
      
      inline def setReplayVideoAutoplayAndLoopOffUndefined: Self = StObject.set(x, "replayVideoAutoplayAndLoopOff", js.undefined)
      
      inline def setShowReplayControls(value: Boolean): Self = StObject.set(x, "showReplayControls", value.asInstanceOf[js.Any])
      
      inline def setShowReplayControlsUndefined: Self = StObject.set(x, "showReplayControls", js.undefined)
      
      inline def setTimeLimit(value: Double): Self = StObject.set(x, "timeLimit", value.asInstanceOf[js.Any])
      
      inline def setTimeLimitUndefined: Self = StObject.set(x, "timeLimit", js.undefined)
      
      inline def setUseVideoInput(value: Boolean): Self = StObject.set(x, "useVideoInput", value.asInstanceOf[js.Any])
      
      inline def setUseVideoInputUndefined: Self = StObject.set(x, "useVideoInput", js.undefined)
    }
  }
  
  trait VideoActionsProps extends StObject {
    
    var countdownTime: Double
    
    var isCameraOn: Boolean
    
    var isConnecting: Boolean
    
    var isInlineRecordingSupported: Boolean
    
    var isRecording: Boolean
    
    var isReplayingVideo: Boolean
    
    var isRunningCountdown: Boolean
    
    var isVideoInputSupported: Boolean
    
    var onConfirm: js.UndefOr[js.Function0[Any]] = js.undefined
    
    var onOpenVideoInput: js.UndefOr[js.Function0[Any]] = js.undefined
    
    var onPauseRecording: js.UndefOr[js.Function0[Any]] = js.undefined
    
    var onResumeRecording: js.UndefOr[js.Function0[Any]] = js.undefined
    
    var onStartRecording: js.UndefOr[js.Function0[Any]] = js.undefined
    
    var onStopRecording: js.UndefOr[js.Function0[Any]] = js.undefined
    
    var onStopReplaying: js.UndefOr[js.Function0[Any]] = js.undefined
    
    var onTurnOffCamera: js.UndefOr[js.Function0[Any]] = js.undefined
    
    var onTurnOnCamera: js.UndefOr[js.Function0[Any]] = js.undefined
    
    var replayVideoAutoplayAndLoopOff: Boolean
    
    var showReplayControls: Boolean
    
    var streamIsReady: Boolean
    
    var thereWasAnError: Boolean
    
    var timeLimit: Double
    
    var useVideoInput: Boolean
  }
  object VideoActionsProps {
    
    inline def apply(
      countdownTime: Double,
      isCameraOn: Boolean,
      isConnecting: Boolean,
      isInlineRecordingSupported: Boolean,
      isRecording: Boolean,
      isReplayingVideo: Boolean,
      isRunningCountdown: Boolean,
      isVideoInputSupported: Boolean,
      replayVideoAutoplayAndLoopOff: Boolean,
      showReplayControls: Boolean,
      streamIsReady: Boolean,
      thereWasAnError: Boolean,
      timeLimit: Double,
      useVideoInput: Boolean
    ): VideoActionsProps = {
      val __obj = js.Dynamic.literal(countdownTime = countdownTime.asInstanceOf[js.Any], isCameraOn = isCameraOn.asInstanceOf[js.Any], isConnecting = isConnecting.asInstanceOf[js.Any], isInlineRecordingSupported = isInlineRecordingSupported.asInstanceOf[js.Any], isRecording = isRecording.asInstanceOf[js.Any], isReplayingVideo = isReplayingVideo.asInstanceOf[js.Any], isRunningCountdown = isRunningCountdown.asInstanceOf[js.Any], isVideoInputSupported = isVideoInputSupported.asInstanceOf[js.Any], replayVideoAutoplayAndLoopOff = replayVideoAutoplayAndLoopOff.asInstanceOf[js.Any], showReplayControls = showReplayControls.asInstanceOf[js.Any], streamIsReady = streamIsReady.asInstanceOf[js.Any], thereWasAnError = thereWasAnError.asInstanceOf[js.Any], timeLimit = timeLimit.asInstanceOf[js.Any], useVideoInput = useVideoInput.asInstanceOf[js.Any])
      __obj.asInstanceOf[VideoActionsProps]
    }
    
    extension [Self <: VideoActionsProps](x: Self) {
      
      inline def setCountdownTime(value: Double): Self = StObject.set(x, "countdownTime", value.asInstanceOf[js.Any])
      
      inline def setIsCameraOn(value: Boolean): Self = StObject.set(x, "isCameraOn", value.asInstanceOf[js.Any])
      
      inline def setIsConnecting(value: Boolean): Self = StObject.set(x, "isConnecting", value.asInstanceOf[js.Any])
      
      inline def setIsInlineRecordingSupported(value: Boolean): Self = StObject.set(x, "isInlineRecordingSupported", value.asInstanceOf[js.Any])
      
      inline def setIsRecording(value: Boolean): Self = StObject.set(x, "isRecording", value.asInstanceOf[js.Any])
      
      inline def setIsReplayingVideo(value: Boolean): Self = StObject.set(x, "isReplayingVideo", value.asInstanceOf[js.Any])
      
      inline def setIsRunningCountdown(value: Boolean): Self = StObject.set(x, "isRunningCountdown", value.asInstanceOf[js.Any])
      
      inline def setIsVideoInputSupported(value: Boolean): Self = StObject.set(x, "isVideoInputSupported", value.asInstanceOf[js.Any])
      
      inline def setOnConfirm(value: () => Any): Self = StObject.set(x, "onConfirm", js.Any.fromFunction0(value))
      
      inline def setOnConfirmUndefined: Self = StObject.set(x, "onConfirm", js.undefined)
      
      inline def setOnOpenVideoInput(value: () => Any): Self = StObject.set(x, "onOpenVideoInput", js.Any.fromFunction0(value))
      
      inline def setOnOpenVideoInputUndefined: Self = StObject.set(x, "onOpenVideoInput", js.undefined)
      
      inline def setOnPauseRecording(value: () => Any): Self = StObject.set(x, "onPauseRecording", js.Any.fromFunction0(value))
      
      inline def setOnPauseRecordingUndefined: Self = StObject.set(x, "onPauseRecording", js.undefined)
      
      inline def setOnResumeRecording(value: () => Any): Self = StObject.set(x, "onResumeRecording", js.Any.fromFunction0(value))
      
      inline def setOnResumeRecordingUndefined: Self = StObject.set(x, "onResumeRecording", js.undefined)
      
      inline def setOnStartRecording(value: () => Any): Self = StObject.set(x, "onStartRecording", js.Any.fromFunction0(value))
      
      inline def setOnStartRecordingUndefined: Self = StObject.set(x, "onStartRecording", js.undefined)
      
      inline def setOnStopRecording(value: () => Any): Self = StObject.set(x, "onStopRecording", js.Any.fromFunction0(value))
      
      inline def setOnStopRecordingUndefined: Self = StObject.set(x, "onStopRecording", js.undefined)
      
      inline def setOnStopReplaying(value: () => Any): Self = StObject.set(x, "onStopReplaying", js.Any.fromFunction0(value))
      
      inline def setOnStopReplayingUndefined: Self = StObject.set(x, "onStopReplaying", js.undefined)
      
      inline def setOnTurnOffCamera(value: () => Any): Self = StObject.set(x, "onTurnOffCamera", js.Any.fromFunction0(value))
      
      inline def setOnTurnOffCameraUndefined: Self = StObject.set(x, "onTurnOffCamera", js.undefined)
      
      inline def setOnTurnOnCamera(value: () => Any): Self = StObject.set(x, "onTurnOnCamera", js.Any.fromFunction0(value))
      
      inline def setOnTurnOnCameraUndefined: Self = StObject.set(x, "onTurnOnCamera", js.undefined)
      
      inline def setReplayVideoAutoplayAndLoopOff(value: Boolean): Self = StObject.set(x, "replayVideoAutoplayAndLoopOff", value.asInstanceOf[js.Any])
      
      inline def setShowReplayControls(value: Boolean): Self = StObject.set(x, "showReplayControls", value.asInstanceOf[js.Any])
      
      inline def setStreamIsReady(value: Boolean): Self = StObject.set(x, "streamIsReady", value.asInstanceOf[js.Any])
      
      inline def setThereWasAnError(value: Boolean): Self = StObject.set(x, "thereWasAnError", value.asInstanceOf[js.Any])
      
      inline def setTimeLimit(value: Double): Self = StObject.set(x, "timeLimit", value.asInstanceOf[js.Any])
      
      inline def setUseVideoInput(value: Boolean): Self = StObject.set(x, "useVideoInput", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactVideoRecorder.reactVideoRecorderStrings.videoSlashwebmSemicoloncodecsEqualssignQuotationmarkvp8VerticallineopusQuotationmark
    - typings.reactVideoRecorder.reactVideoRecorderStrings.videoSlashwebmSemicoloncodecsEqualssignh264
    - typings.reactVideoRecorder.reactVideoRecorderStrings.videoSlashwebmSemicoloncodecsEqualssignvp9
    - typings.reactVideoRecorder.reactVideoRecorderStrings.videoSlashwebm
    - typings.reactVideoRecorder.reactVideoRecorderStrings.videoSlashmp4
  */
  trait VideoRecorderMimeTypes extends StObject
  object VideoRecorderMimeTypes {
    
    inline def videoSlashmp4: typings.reactVideoRecorder.reactVideoRecorderStrings.videoSlashmp4 = "video/mp4".asInstanceOf[typings.reactVideoRecorder.reactVideoRecorderStrings.videoSlashmp4]
    
    inline def videoSlashwebm: typings.reactVideoRecorder.reactVideoRecorderStrings.videoSlashwebm = "video/webm".asInstanceOf[typings.reactVideoRecorder.reactVideoRecorderStrings.videoSlashwebm]
    
    inline def videoSlashwebmSemicoloncodecsEqualssignQuotationmarkvp8VerticallineopusQuotationmark: typings.reactVideoRecorder.reactVideoRecorderStrings.videoSlashwebmSemicoloncodecsEqualssignQuotationmarkvp8VerticallineopusQuotationmark = "video/webm;codecs=\"vp8|opus\"".asInstanceOf[typings.reactVideoRecorder.reactVideoRecorderStrings.videoSlashwebmSemicoloncodecsEqualssignQuotationmarkvp8VerticallineopusQuotationmark]
    
    inline def videoSlashwebmSemicoloncodecsEqualssignh264: typings.reactVideoRecorder.reactVideoRecorderStrings.videoSlashwebmSemicoloncodecsEqualssignh264 = "video/webm;codecs=h264".asInstanceOf[typings.reactVideoRecorder.reactVideoRecorderStrings.videoSlashwebmSemicoloncodecsEqualssignh264]
    
    inline def videoSlashwebmSemicoloncodecsEqualssignvp9: typings.reactVideoRecorder.reactVideoRecorderStrings.videoSlashwebmSemicoloncodecsEqualssignvp9 = "video/webm;codecs=vp9".asInstanceOf[typings.reactVideoRecorder.reactVideoRecorderStrings.videoSlashwebmSemicoloncodecsEqualssignvp9]
  }
}
