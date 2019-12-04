organization := "org.scalablytyped"
name := "storybook__ui"
version := "5.2.6-522a08"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "csstype" % "2.6.6-a93afc",
  "org.scalablytyped" %%% "emotion-theming" % "10.0.19-f77934",
  "org.scalablytyped" %%% "emotion__core" % "10.0.20-b47ec2",
  "org.scalablytyped" %%% "emotion__serialize" % "0.11.11-f6e8da",
  "org.scalablytyped" %%% "emotion__styled" % "10.0.17-4cb984",
  "org.scalablytyped" %%% "emotion__styled-base" % "10.0.19-31c96d",
  "org.scalablytyped" %%% "emotion__utils" % "0.11.2-602d68",
  "org.scalablytyped" %%% "history" % "4.7.2-dt-20191126Z-4ceb2f",
  "org.scalablytyped" %%% "popper_dot_js" % "1.16.0-a9bf73",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190924Z-5cddf8",
  "org.scalablytyped" %%% "reach__router" % "1.2-dt-20191009Z-c8962f",
  "org.scalablytyped" %%% "react" % "16.9-dt-20191126Z-3d1d47",
  "org.scalablytyped" %%% "react-textarea-autosize" % "4.3.0-dt-20191105Z-e47f1b",
  "org.scalablytyped" %%% "std" % "3.7-1d724d",
  "org.scalablytyped" %%% "storybook__addon-actions" % "5.2.6-0d56c6",
  "org.scalablytyped" %%% "storybook__api" % "5.2.6-def4ec",
  "org.scalablytyped" %%% "storybook__channels" % "5.2.6-06fa66",
  "org.scalablytyped" %%% "storybook__components" % "5.2.6-55c041",
  "org.scalablytyped" %%% "storybook__theming" % "5.2.6-9ccce3")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        