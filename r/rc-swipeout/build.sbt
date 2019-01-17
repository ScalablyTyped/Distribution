organization := "org.scalablytyped"
name := "rc-swipeout"
version := "2.0.11-72a17c"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "classnames" % "2.2-dt-20181230Z-6d1ba2",
  "org.scalablytyped" %%% "create-react-class" % "15.6-dt-20180806Z-c53395",
  "org.scalablytyped" %%% "csstype" % "2.5.8-61e37d",
  "org.scalablytyped" %%% "prop-types" % "15.5-dt-20181212Z-692895",
  "org.scalablytyped" %%% "rc-gesture" % "0.0.22-1d2979",
  "org.scalablytyped" %%% "react" % "16.7-dt-20190116Z-334a51",
  "org.scalablytyped" %%% "react-native-swipeout" % "2.3.6-07fe31",
  "org.scalablytyped" %%% "std" % "3.2.2-2926f1")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        