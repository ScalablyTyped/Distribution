organization := "org.scalablytyped"
name := "redux-sentry-middleware"
version := "0.1-dt-20200914Z-7320b1"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.0",
  "org.scalablytyped" %%% "redux" % "4.0.5-09f522",
  "org.scalablytyped" %%% "sentry__browser" % "5.27.4-1b9daa",
  "org.scalablytyped" %%% "sentry__core" % "5.27.4-7c83f3",
  "org.scalablytyped" %%% "sentry__hub" % "5.27.4-d113f5",
  "org.scalablytyped" %%% "sentry__types" % "5.27.4-05e047",
  "org.scalablytyped" %%% "sentry__utils" % "5.27.4-2158e8",
  "org.scalablytyped" %%% "std" % "4.1-40053c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
